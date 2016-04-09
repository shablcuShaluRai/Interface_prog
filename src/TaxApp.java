interface Tax {
	double stateTax();
}

class Ap implements Tax {

	public double stateTax() {
		System.out.println(" According to class Ap govt rules");
		return 5000.50;
	}

}

class Karnataka implements Tax {

	public double stateTax() {
		System.out.println(" According to class Karnataka govt rules");
		return 2000.00;
	}

}

public class TaxApp {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName(args[0]);
		Tax ref = (Tax) c.newInstance();
		calculateTax(ref);
	}

	static void calculateTax(Tax t) {
		double ct = 1000.00;
		double st = t.stateTax();
		System.out.println("Total Tax" + (ct + st));
	}

}
