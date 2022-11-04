package pack;

import java.util.Iterator;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
//		vector class has 4 constructer.
//		default constructer.
		Vector list = new Vector();
		list.add("faiz");
		list.add(50000);
		list.add("Ahmad");
		list.add(50000);
		
		System.out.println(list);
		
//		for each loop.
		for(Object obj: list){
			Object o = (Object)obj;
			System.out.println(o);
		}
		

//		Iterator curser.
//		user defined capacity constructer.
		
		Vector list01 = new Vector(5);
		list01.add("faiz");
		list01.add(50000);
		list01.add("Ahmad");
		list01.add(50000);
		list01.add("AhmadKhan");
		list01.add(50658);
		list01.add("AhmadJan");
		list01.add(5590);
		
		
		Iterator data = list01.iterator();
		while(data.hasNext()){
			Object obj = (Object)data.next();
			System.out.println(obj);
		}
		System.out.println(list01.capacity());
		
		
		
//		3 constrcter in the vectoer classes.
		
		System.out.println("/////////////////////////////////////");
		
		Vector list02 = new Vector(5, 8);
		list02.add("faiz");
		list02.add(50000);
		list02.add("Ahmad");
		list02.add(50000);
		list02.add("AhmadKhan");
		list02.add(50658);
		list02.add("AhmadJan");
		list02.add(5590);
	
		
		Iterator data01 = list02.iterator();
		while(data01.hasNext()){
			Object ob = (Object)data01.next();
			System.out.println(ob);
		}
		System.out.println(list02.capacity());
		
	}
}
