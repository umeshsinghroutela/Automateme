package practice.java.programe;

import java.util.Scanner;

class Stack{
	private int maxSize;
	private int top;
	private String arr[];

	public Stack(int size) {
		System.out.println("Array Size is "+ size);
		maxSize = size;
		top = -1;
		arr = new String[maxSize];
	}

	public void push(String val) {
		String value = val+"";
		if (value.isEmpty() | value.equalsIgnoreCase("null")) {
			System.out.println("Please Enter Valid/NonEmpty String");
		}
		else{
			if (top < maxSize-1) {
				arr[++top] = value;
				System.out.println("Item added "+ value);
			}
			else{
				System.out.println("Stack is Full .....Cannot add ->"+ value);
			}
		}
	}

	private boolean isEmpty() {
		if (top<0) {
			return true;
		}
		else return false;
	}

	public String pop() {

		if (isEmpty()) {
			System.out.println(" Stack is Empty Cannot delete");
			return null;
		}

		System.out.println(top);
		String delvalue = arr[top];
		arr[top--] = null;
		System.out.println("Iteme Deteled From Stack is =>"+ delvalue);
		System.out.println("top "+ top);
		return delvalue;
	}

	public String peep(){
		if (isEmpty()){
			System.out.println("No Element to peep... ");
			return null;
		}
		else{
			System.out.println(arr[top]);
			return arr[top];
		}

	}

	public void  displayElements() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else{
			for (String value : arr) {
				if (value!=null) {
					System.out.println(value);
				}
			}
		}
	}
}

public class ProgStack {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the size of Array");
		int size = s.nextInt();
		Stack st = new Stack(size);
		int i=1;
		do {
			System.out.println("Enter Your choice 1 to push/ 2 to delete /3 to peep /4 to display /9 to exit");
			int opt = s.nextInt();
			s.nextLine();
			switch (opt) {
			case 1:
				System.out.println("Enter the String");
				String val =s.nextLine();
				st.push(val);
				break;

			case 2:
				st.pop();
				break;
			case 3:
				st.peep();
				break;
			case 4:
				st.displayElements();
				break;
			case 9:
				i++;
				System.out.println("Exiting ........ ");
				System.out.println("EXITED!!");
				break;
			default:
				System.out.println("Wrong Entry \n ");
				
				break;
			}

		} while (i==1);
		s.close();  

	}
}
