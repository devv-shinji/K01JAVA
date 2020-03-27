package ex17collection;

import java.util.HashSet;

import common.Person;

public class Ex04HashSet2 {
	public static void main(String[] args) {
		
		HashSet<Person> hashSet = new HashSet<Person>();
		
		Person p1 = new Person("현빈", 30);
		Person p2 = new Person("현빈짱", 20);
		Person p3 = new Person("현빈", 30);
		Person p4 = new Person("현빈", 40);
		Person p5 = new Person("현빈짱짱", 30);
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		boolean c = hashSet.add(p4);
		boolean d = hashSet.add(p5);
		System.out.println("p3 객체 저장여부: "+ b);
		System.out.println("p3 객체 저장여부: "+ c);
		System.out.println("p3 객체 저장여부: "+ d);
		
		System.out.println("HashSet에 저장된 객체수:"+ hashSet.size());
		
	}
}
