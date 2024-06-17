// Time Complexity : push/pop/peek: O(1) as we are not reshuffling the entire array.
// Space Complexity : O(n) -> Used an array to store the elements
// Did this code successfully run on Leetcode : Couldn't find the problem
// Any problem you faced while coding this : No (Watched online explanations)
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        // Represents an empty stack if top = -1
        return top < 0;
    } 

    Stack() 
    { 
        // Initialize top = -1 to represent an empty stack
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top >= (MAX -1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[top + 1] = x;
            System.out.println(x + " is pushed inside stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top < 0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int x = a[top - 1];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top < 0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int x = a[top];
            return x;
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
