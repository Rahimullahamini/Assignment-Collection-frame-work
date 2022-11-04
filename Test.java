package pack;

import java.util.ArrayList;

public class Test {

	private static Object customer;

	public static void main(String[] args) {
		
		ArrayList<product> arr1list = new ArrayList<product>();
		arr1list.add(new product(1, "computer"));
		
		
		ArrayList<customer> arr2list = new ArrayList<customer>(20);
		arr2list.add(new customer(10, "ahmad"));
		
		
		
		ArrayList stock = new ArrayList(arr1list);
		stock.add("Faiz Ahmad Faiz");
		

//		System.out.println(stock);
		
//		for(Object ob: arr1list){
		
//			if(ob instanceof product){
//				product p = (product)ob;
////				System.out.println((p.pId + " ; " + p.pName);
//				System.out.println(p.pId + "  " + p.pName);
//			}
//		}
		
//		System.out.println(stock);
		
		for(Object o: stock){
			if(o instanceof product){
				product p = (product)o;
				System.out.println(p.pId + " " + p.pName);
			}else if(o instanceof customer){
				customer c = (customer)o;
				System.out.println(c.cId + " " + c.cName);
			}else if(o instanceof String){
				System.out.println(stock);
			}
		}
	}
}
