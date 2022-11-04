package pack;

import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
		
////		Normal ArrayList.
		
//		ArrayList arr = new ArrayList();
//		arr.add(40);
//		arr.add("alijan");
//		System.out.println(arr);
		
		
////		Generic ArrayList.	
		
//		ArrayList<String> arrg = new ArrayList<String>();
//		
//		arrg.add("ali");
//		arrg.add("khan");
//		System.out.println(arrg);
//		
		
		ArrayList arrlist = new ArrayList();
		arrlist.add(5403);
		arrlist.add("ahmad");
		arrlist.add(new emp(12, "Khan"));
		arrlist.add(new Customer(1000, "Ahmadjan"));
		
//		System.out.println(arrlist);
		
//		Object o = (Object)arrlist.get(arg0)
		for(Object o01: arrlist){
			if(o01 instanceof emp){
				emp e1 = (emp)o01;
				System.out.println(e1.eid);
				System.out.println(e1.eName);
			}else if(o01 instanceof Customer){
				Customer c1 = (Customer)o01;
				System.out.println(c1.cId);
				System.out.println(c1.cName);
			}else if(o01 instanceof String){
				System.out.println(arrlist);
			}else if(o01 instanceof Integer){
				System.out.println(o01);
			}
		}
	}
}
