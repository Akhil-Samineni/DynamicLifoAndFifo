/*
• Add(number) - adds the number to the stack
• Get() - removes the next number from the stack and returns it
• IsEmpty() - returns whether the stack is empty
• Size() - returns the stack's size
• arraySize() - returns the original array size not the number of element's in array
• arraySize grows and shrinks dynamically according to insertions and deletions
*/
public class StackImplementation implements LifoAndFifo {
    int[] array;
    int top=0; // to keep track of number of elements in array
    private Utility utility;
    public StackImplementation(Utility utility){
        array=new int[0];
        this.utility=utility;
    }

    public void add(int number){
        if(array.length==0 || top%array.length==0) {
            array = utility.increaseOrDecrease(true, array, top);
        }
        System.out.println("Added element " + number + " to stack");
        array[top]=number;
        top++;
    }

    public int get(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int temp=array[top-1];
        System.out.println("removing top of stack " + temp);
        array[top-1]=0;
        top--;
        System.out.println("top value is "+ top);

        if(top>=4 && array.length%top==0){
            array=utility.increaseOrDecrease(false,array,top);
        }

        return temp;
    }

    public boolean isEmpty(){
        return top==0?true:false;
    }

    public int size(){
        return top;
    }

    public int arraySize(){
        return utility.arraySize(array);
    }

    public static void main(String[] args){

    }
}
