import java.util.*;
import java.lang.*;
import java.io.*;

public class Stack
{
	int top = -1;
	private int MAX_STACK_SIZE;
	int stack[];
	
	public Stack(int stackSize) {
		MAX_STACK_SIZE = stackSize;
		stack = new int[MAX_STACK_SIZE];
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Stack stack = new Stack(100);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public boolean is_empty() { // 공백상태 체크
		if (top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean is_full() { // 포화상태 체크
		if (top >= (MAX_STACK_SIZE-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int x) { // 스택 넣기
		if (is_full()) {
			System.out.println("overflow");
		}
		else {
			top += 1;
			stack[top] = x;
		}
	}
	
	public int pop() { // 꺼내기
		if (is_empty()) {
			System.out.println("underflow");
			System.exit(1);
		}
		int e = stack[top];
		top -= 1;
		return e;
	}
	
	public int peek() { // 삭제하지 않고 읽기
		if(is_empty()) {
			System.out.println("underflow");
			System.exit(1);
		}
		return stack[top];
	}
}
