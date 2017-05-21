package br.com.fiap.turma29scj.fundamentosjava.atividade3;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int arraySize = 1_000_000;
		System.out.println("Tamanho dos dados: " + arraySize);
		Exercicio3 exercicio = new Exercicio3();
		exercicio.testArrayList(arraySize);
		exercicio.testLinkedList(arraySize);
		System.out.println("----------------------------------");
		exercicio.testStack(arraySize);
		exercicio.hashSet(arraySize);
		System.out.println("----------------------------------");
		exercicio.hashMap(arraySize);
		exercicio.weakHashMap(arraySize);
		System.out.println("----------------------------------");

	
	}


	public void testArrayList(int arraySize) {
		System.out.println("Array List: ");
		ArrayList<Integer> arrayList = new ArrayList<>();
		Instant t1,t2;
		
		t1 = startChronometer();
		for (int i=0; i < arraySize; i++) {
			arrayList.add(i);	
		}
		t2 = stopChronometer();		
		System.out.println("\tInserção: " + calculateMilis(t1, t2));
		
		
		t1 = startChronometer();
		System.out.println("\tData: " + arrayList.get(500000));
		t2 = stopChronometer();
		System.out.println("\tBusca: " + calculateMilis(t1, t2));
	}
	
	
	public void testLinkedList(int arraySize) {
		
		System.out.println("Linked List: ");
		LinkedList<Integer> arrayList = new LinkedList<>();
		Instant t1,t2;
		
		t1 = startChronometer();
		for (int i=0; i < arraySize; i++) {
			arrayList.add(i);	
		}
		t2 = stopChronometer();		
		System.out.println("\tInserção: " + calculateMilis(t1, t2));
		
		
		t1 = startChronometer();
		System.out.println("\tData: " + arrayList.get(500000));
		t2 = stopChronometer();
		System.out.println("\tBusca: " + calculateMilis(t1, t2));
	
	}
	
	
	public void testStack(int arraySize) {
		
		System.out.println("Stack: ");
		Stack<Integer> stack = new Stack<>();
		Instant t1,t2;
		
		t1 = startChronometer();
		for (int i=0; i < arraySize; i++) {
			stack.add(i);	
		}
		t2 = stopChronometer();		
		System.out.println("\tInserção: " + calculateMilis(t1, t2));		
		
		t1 = startChronometer();
		System.out.println("\tData: " + stack.get(500000));
		t2 = stopChronometer();
		System.out.println("\tBusca: " + calculateMilis(t1, t2));
	}
	
	public void hashSet(int arraySize) {
		
		System.out.println("HashSet: ");
		HashSet<Integer> stack = new HashSet<>();
		Instant t1,t2;
		
		t1 = startChronometer();
		for (int i=0; i < arraySize; i++) {
			stack.add(i);	
		}
		t2 = stopChronometer();		
		System.out.println("\tInserção: " + calculateMilis(t1, t2));		
		
		t1 = startChronometer();
		System.out.println("\tData: " + stack.contains(500000));
		t2 = stopChronometer();
		System.out.println("\tBusca: " + calculateMilis(t1, t2));
	}
	
	
	public void hashMap(int arraySize) {
		
		System.out.println("HashMap: ");
		HashMap<Integer, Integer> map = new HashMap<>();
		Instant t1,t2;
		
		t1 = startChronometer();
		for (int i=0; i < arraySize; i++) {
			map.put(i, i);
		}
		t2 = stopChronometer();		
		System.out.println("\tInserção: " + calculateMilis(t1, t2));		
		
		t1 = startChronometer();
		System.out.println("\tData: " + map.get(500000));
		t2 = stopChronometer();
		System.out.println("\tBusca: " + calculateMilis(t1, t2));
	}
	
	
	public void weakHashMap(int arraySize) {
		
		System.out.println("WeakHashMap: ");
		WeakHashMap<Integer,Integer> map = new WeakHashMap<>();
		Instant t1,t2;
		
		t1 = startChronometer();
		for (int i=0; i < arraySize; i++) {
			map.put(i, i);
		}
		t2 = stopChronometer();
		System.out.println("Garbage colector esta realizando limpezacpor isso hash map é menor que 1M...");
		System.out.println("\tInserção: " + calculateMilis(t1, t2));		
		System.out.println("Hash Size: " + map.size());
		t1 = startChronometer();
		
		System.out.println("\tData: " + map.get(new Integer(500_00)));
		t2 = stopChronometer();
		System.out.println("\tBusca: " + calculateMilis(t1, t2));		
	}

	
	public Instant startChronometer() {
		return Instant.now();
	
	}
	
	public Instant stopChronometer() {
		return Instant.now();
	}
	
	public String calculateMilis(Instant t1, Instant t2) {
		return ChronoUnit.MILLIS.between(t1, t2) + " milisegundos";
		
		
	}

}
