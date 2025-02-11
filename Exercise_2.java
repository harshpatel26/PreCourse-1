class StackAsLinkedList {
    // Time Complexity : O(1)
    // Space Complexity: O(1)

    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.next = null;
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return (root == null);

    }
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp  =  new StackNode(data);
        temp.next = root;
        root = temp;
    }
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (root== null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int data = root.data;
        root = root.next;
        return data;

    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root== null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
    }
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from empty stack");
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
