package Codes;

class A {
	void meth(int a) {
		System.out.println(a);
	}

	void meth(int a, int b) {
		System.out.println(a + b);

	}
}

public class Overloading {
	public static void main(String[] args) {
		A a=new A();
		a.meth(2);
		a.meth(2, 3);
	}

}
