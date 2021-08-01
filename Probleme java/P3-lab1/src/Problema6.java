
public class Problema6 {

	static boolean palindrom(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String b = sb.toString();
		return s.equals(b);
	}

	public static void main(String[] args) {
		// eu imi scriu pe foaie ana si il instalez dupa ora ca
		// sa nu pierd timpul nu gasesc
		// java ul pentru macbook, pot ana folosi ceva alternativa?
		System.out.println(args.length);

		int nr = 0;
		for (String s : args) {
			if (palindrom(s))
				nr++;
		}

		System.out.println(nr);

		StringBuilder sb = new StringBuilder();

		for (String s : args) {
			sb.append(s + " ");
		}

		String b = sb.toString();

		System.out.println(b.substring(b.length() - 11));

		System.out.println(b.toUpperCase());
		b = b + "A";
		System.out.println(b.toLowerCase());

		String k = "e a";
		System.out.println(b.contains(k));

		String voc = "aeiou";

		for (int i = 0; i < voc.length(); i++) {
			b = b.replaceAll(voc.charAt(i) + "", voc.charAt(i) + "p" + voc.charAt(i));
		}

		System.out.println(b);

	}
}
