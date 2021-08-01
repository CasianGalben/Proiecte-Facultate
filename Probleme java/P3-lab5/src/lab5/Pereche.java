package lab5;

public class Pereche<T> {
	T x; //prima pereche
	T y; // a doua pereche
	
  public Pereche(T x,T y)
  {
	  this.x=x;
	  this.y=y;
  }
  public Pereche()
  {
	  
  }
/**
 * @return the x
 */
public T getX() {
	return x;
}
/**
 * @param x the x to set
 */
public void setX(T x) {
	this.x = x;
}
/**
 * @return the y
 */
public T getY() {
	return y;
}
/**
 * @param y the y to set
 */
public void setY(T y) {
	this.y = y;
}
@Override
public String toString() {
	return "Pereche [x=" + x + ", y=" + y + "]";
}

public static<T> void swap(Pereche<T> t) {
	T temp = t.x;
	t.x=t.y;
	t.y=temp;
	
}
  
}
