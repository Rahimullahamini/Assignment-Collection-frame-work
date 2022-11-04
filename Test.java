package pack;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("FaizAhamd");
		list.add("Ahmad");
		list.add(5960);
		
//		Normal ListIterator.
		
		ListIterator data = list.listIterator();
		while(data.hasNext()){
			Object obj = (Object)data.next();
			System.out.println(obj);
			
		}
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		while(data.hasPrevious()){
			Object ob = (Object)data.previous();
			System.out.println(ob);
			
		}
		
//		Genric ListIterator.
		
		ArrayList<student> listdata = new ArrayList<student>();
		listdata.add(new student(1, "Faiz Ahmad Faiz"));
		listdata.add(new student(2, "walid"));
		
		ListIterator<student> listIter = listdata.listIterator();
		while(listIter.hasNext()){
			student s = listIter.next();
			System.out.println(s.sid + " : " + s.sName);
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		while(listIter.hasPrevious()){
			student st = listIter.previous();
			System.out.println(st.sid + " , " + st.sName);
		}
		
		
	}

}
