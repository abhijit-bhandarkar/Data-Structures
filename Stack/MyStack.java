
import java.util.*;


class StackImp{

int arrStack[];
int head, size, length;

//Constructor 
public StackImp(int n)
    {
        size = n;
        length = 0;
        arrStack = new int[size];
        head = -1;
    }

//To Push a value into stack
	public void stPush(int value){
		if(head >= size-1)
			throw new IndexOutOfBoundsException(": Overflow Exception");
		else{
			arrStack[++head] = value;
			length++;
		}
	}

//To Pop a value from stack
	public void stPop(){
		if(isEmpty())
			throw new NoSuchElementException(": Underflow Exception");
		else{
		//	arrStack[head-1] = arrStack[head];
			head--;
			length--;
		}
	}
	
// To check if stack is Full
	public boolean isFull(){
	if(head == size-1)
		return true;
	else 
		return false;
	}

// To check if stack is Empty
	public boolean isEmpty(){
	if(head == -1)
		return true;
	else 
		return false;
	}

//To display the stack
	public void display(){
		if(length == 0)
			System.out.println("Stack is Empty");
		else{
			System.out.print("Stack elements : ");
			for(int i=head; i>=0; i--)
			{
				System.out.print(arrStack[i]+" ");
			}
			System.out.println();
		}
	}

	public int getSize(){
		return length;
	}
  }

public class MyStack{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int n = s.nextInt();
		StackImp stk = new StackImp(n);

		char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Size");

        int choice = s.nextInt();
        
        switch(choice)
        {
        	case 1 :
        		try{
        		System.out.println("Enter the element");
        		stk.stPush(s.nextInt());
        		}

        		catch(Exception e)
        		{
        			System.out.println("Error : " +e.getMessage());
        		}
        		break;

        	case 2:
        		try{
        			stk.stPop();
        		}
        		catch(Exception e){
        			System.out.println("Error :"+e.getMessage());
        		}
        		break;

        	case 3:
        		System.out.println("Stack size is :"+ stk.getSize());
        		break;

        	default :
        		System.out.println("Gadbad");	
        		break;
        	}
        stk.display();
        System.out.println("\nDo you want to continue (Type y or n) \n");
    	ch = s.next().charAt(0);

        }   while (ch == 'Y'|| ch == 'y');       
	} 
}