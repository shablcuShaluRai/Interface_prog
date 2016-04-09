//multiple inheritance

interface Father {
	float HT = 6.2f;

	void height();

}

interface Mother {
	float HT = 5.8f;

	void height();
}

/*
 * After extends there should be only one class (either concrete or abstract)
 * and after implements there can be any number of interfaces.
 * 
 *  between two interfaces, we must use extends keyword only
 *  
 *  
 *  interface A { }		
interface B extends A { }       // observe, extends between two interfaces, permitted
class C { }                     // here, class C can be abstract class also
class D extends C implements B { }
 */

class Child implements Father, Mother {

	public void height() {
		float ht = ((Father.HT + Mother.HT) / 2);
		System.out.println("height of child=" + ht);

	}

}

public class Multiinherit {

	public static void main(String[] args) {
		Child c = new Child();
		c.height();
	}

}
