package ac;
/**
 * Clasa Teleportare care extinde clasa Putere
 * @author Galben Casian
 *
 */
public class Teleportare extends Putere {
    /**
     * Constructor pentru Teleportare
     * @param x XMan
     */
    public Teleportare(XMan x) {
        super(x);
    }

    @Override
    public double getPunctaj() {
        return 10;
    }
}
