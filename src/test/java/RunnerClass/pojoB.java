package RunnerClass;

import pojjo.pojoA;

public class pojoB {
public static void main(String[] args) {
	pojoA r= new pojoA();
	String name = r.getName();
	System.out.println("Before Setters :"+name);
	r.setName("navi");
	String name2 = r.getName();
	System.out.println("After Setters :"+name2);
}
}
