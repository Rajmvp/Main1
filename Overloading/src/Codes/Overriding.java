package Codes;

class B {
	void meth(int a) {
		System.out.println(a);
	}

	void meth(int a, int b) {
		System.out.println(a + b);

	}

}

class C extends B {
	@Override
	void meth(int a) {
		System.out.println("overriden" + a);
	}

	@Override
	void meth(int a, int b) {
		System.out.println("overriden" + a + b);
	}

}

public class Overriding {
public static void main(String[] args) {
	C c=new C();
	c.meth(2);
	c.meth(2, 3);
}
}
