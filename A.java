package jtc3;

public class A {

	private int a;
	private String msg;
	
	public A() {
		System.out.println("A- No- Arg Constructor");
	}
	
	public void setA(int a) {
		System.out.println("A.setA()");
		this.a = a;
	}
	public void setMsg(String msg) {
		System.out.println("A.setB()");
		this.msg = msg;
	}
	
	public String toString(){
		return "" + a + "\t"+ msg;
	}
}
