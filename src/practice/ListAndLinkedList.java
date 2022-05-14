package practice;

import java.util.LinkedList;
import java.util.List;

public class ListAndLinkedList {
public static void main(String[] args) {
	List l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	System.out.println(l1);
	System.out.println("get() :"+l1.get(1));
	System.out.println("indexOf() :"+l1.indexOf(20));
	System.out.println("lastIndexOf() :"+l1.lastIndexOf(10));
	System.out.println("set() :"+l1.set(1, 40));
	System.out.println(l1);
	System.out.println("subList() :"+l1.subList(1, 2));
	System.out.println("ListIterator :"+l1.listIterator());
}
}
