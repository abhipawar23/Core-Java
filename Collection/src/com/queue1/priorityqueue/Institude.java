package com.queue1.priorityqueue;

import java.net.Socket;
import java.util.PriorityQueue;
import java.util.Queue;

public class Institude {

	public Queue<Queue<Queue<String>>> allInstitude() {

		Queue<String> AjaySir = new PriorityQueue<String>();
		AjaySir.add("ABHISHEK");
		AjaySir.add("MAHESH");
		AjaySir.add("ABHISHEK1");

		Queue<String> NileshSir = new PriorityQueue<String>();
		NileshSir.add("SUSHANT");
		NileshSir.add("NISHANT");
		NileshSir.add("PRITAM");

		Queue<Queue<String>> Exponent1 = new PriorityQueue<>();
		Exponent1.add(AjaySir);
		Exponent1.add(NileshSir);

		Queue<String> PrathmeshSir = new PriorityQueue<>();
		PrathmeshSir.add("MAULI");
		PrathmeshSir.add("SHUBHAM");
		PrathmeshSir.add("SAGAR");

		Queue<String> AzasSir = new PriorityQueue<>();
		AzasSir.add("SHIV");
		AzasSir.add("ADI");
		AzasSir.add("ABHI");

		Queue<Queue<String>> Exponent2 = new PriorityQueue<>();
		Exponent2.add(PrathmeshSir);
		Exponent2.add(AzasSir);

		Queue<Queue<Queue<String>>> AllInstitude = new PriorityQueue<>();
		AllInstitude.add(Exponent1);
		AllInstitude.add(Exponent2);
		return AllInstitude;

	}

	public static void main(String[] args) {
		Institude institude = new Institude();
		Queue<Queue<Queue<String>>> AllInstitude = institude.allInstitude();
		System.out.println(AllInstitude);
//		System.out.println("\nUsing For Each Loop");
//		for (Queue<Queue<String>> institudename : AllInstitude) {
//			for (Queue<String> teacher : institudename) {
//				for (String student : teacher) {
//					System.out.println(student);
//				}
//			}
//		}

	}
}
