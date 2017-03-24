package practice.java.programe;

class Stack{
	private int maxSize;
	private int top;
	private String arr[];

	public Stack(int size) {
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
		Stack stack = new Stack(5);
		stack.displayElements();
		stack.push("Data1");
		stack.push("Data2");
		stack.push(null);
		stack.push("Data3");
		stack.push("Data4");
		stack.push("Data5");
		stack.push("Data6");
		stack.push("Data7");
		
		stack.displayElements();
		System.out.println("-----------------");
		stack.peep();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.displayElements();
		stack.push("Data1");
		stack.push("Data2");
		stack.push(null);
		stack.push("Data3");
		stack.push("Data4");
		stack.push("Data5");
		stack.push("Data6");
		stack.push("Data7");
		stack.displayElements();

	}
}

//output
//
//Stack is Empty
//Item added Data1
//Item added Data2
//Please Enter Valid/NonEmpty String
//Item added Data3
//Item added Data4
//Item added Data5
//Stack is Full .....Cannot add ->Data6
//Stack is Full .....Cannot add ->Data7
//Data1
//Data2
//Data3
//Data4
//Data5
//-----------------
//Data5
//4
//Iteme Deteled From Stack is =>Data5
//top 3
//3
//Iteme Deteled From Stack is =>Data4
//top 2
//2
//Iteme Deteled From Stack is =>Data3
//top 1
//1
//Iteme Deteled From Stack is =>Data2
//top 0
//0
//Iteme Deteled From Stack is =>Data1
//top -1
// Stack is Empty Cannot delete
//Stack is Empty
//Item added Data1
//Item added Data2
//Please Enter Valid/NonEmpty String
//Item added Data3
//Item added Data4
//Item added Data5
//Stack is Full .....Cannot add ->Data6
//Stack is Full .....Cannot add ->Data7
//Data1
//Data2
//Data3
//Data4
//Data5

