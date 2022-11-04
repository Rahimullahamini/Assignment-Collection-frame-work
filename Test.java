package pack;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("Faiz");
		list.add("Ali");
		list.add(5000);
		list.add(6000);
		
		System.out.println(list);
		
		list.addFirst("khan");
		System.out.println(list);
		
		
		list.addLast("walid");
		System.out.println(list);
		
		
		list.add(3, 100000);
		System.out.println(list);
		
		list.add(1, 100000);
		System.out.println(list);
		
		list.remove();
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		
		list.removeLast();
		System.out.println(list);
		
		
		
		if(list.isEmpty()){
		System.out.println("LinkedList is imPmty");
		}else{
			System.out.println("LinkedList is valid data...  ");
		}
		
		
		list.clear();
		System.out.println(list);
	}

}
