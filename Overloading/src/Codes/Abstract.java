package Codes;

abstract class D {
	void meth() {
		System.out.println("non-ststic");
	}

	static void meth1() {
		System.out.println("Staic");

	}

	abstract void meth2();
}

class E extends D {
	@Override
	void meth2() {
		System.out.println("abstact method");
	}

}

public class Abstract {
	public static void main(String[] args) {
		E e = new E();
		e.meth();
		E.meth1();
		e.meth2();
	}

}
