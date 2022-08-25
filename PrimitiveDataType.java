package com.bridgelabday1;



class PrimitiveData {

	int a;
	float b;
	double c;
	boolean d;
	String e;
	char f;
	long g;

	public void printValue() {
		System.out.println("int default value: "+a);
		System.out.println("float default value: "+b);
		System.out.println("double default value: "+c);
		System.out.println("boolean default value: "+d);
		System.out.println("String defaulat value: "+e);
		System.out.println("char defaul tvalue: "+f);
		System.out.println("long default value: "+g);
	}
}
public class PrimitiveDataType {
	public static void main(String args[]) {
		PrimitiveData data = new PrimitiveData();
		data.printValue();
	}
}
