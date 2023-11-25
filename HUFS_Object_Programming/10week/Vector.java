/* 테스트 케이스
empty
empty
empty
issTsackempty?true
position of 3: -1*/

import java.io.*;
import java.util.*;

public class Main {
	public static class MyStack<E> extends Vector<E> {
		public void push(E item){
			add(item);
	 	}
		
		public E pop(){
			if (isEmpty()){
				System.out.println("System is empty.");
				return null;
			}else {
				E item = lastElement();
				remove(size() - 1);
				return item;
			}
		}
		
		public E peek(){
			if (isEmpty()) {
				System.out.println("Stack is empty.");
				return null;
			} else {
				return lastElement();
			}
		}
	
	}

	public static void main(String[] args) {
		
		MyStack<Integer> stack = new MyStack<>();
		
		Scanner scanner = new Scanner(System.in);
		int n = 0; int num=0;
		n = scanner.nextInt();
		
		for(int i=0; i<n; i++){
			String name = scanner.next();
			if(name.equals("push")){
				num = scanner.nextInt();
				
				stack.push(num);
			}
			else if(name.equals("pop")){
				if (stack.isEmpty()){
					System.out.println("Stack is empty.");
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(!stack.isEmpty()){
			System.out.println("Peek: " + stack.peek());
		}
		else {
			System.out.println("Stack is empty.");
		}
		
		System.out.println("Is Stack empty? " + stack.isEmpty());
		
		int position = -1;
		for(int i = 0; i < stack.size(); i++){
			if(stack.get(i) == 3){
				position = i +1;
				break;
			}
	}
	System.out.println("Position of 3: " + position);
	}
}

// add, get, isEmpty
