/*
• Add(number) - adds the number to the queue
• Get() - removes the next number from the queue and returns it
• IsEmpty() - returns whether the queue is empty
• Size() - returns the queue's size
• arraySize() - returns the original array size not the number of element's in array
• arraySize grows and shrinks dynamically according to insertions and deletions
*/
public class QueueImplementation implements LifoAndFifo{
    int[] array;
    int top = 0; // to keep track of number of elements in array
    private Utility utility;
    public QueueImplementation(Utility utility) {
        array = new int[0];
        this.utility=utility;
    }

    public void add(int number) {
        if(array.length==0 || top%array.length==0){
            array = utility.increaseOrDecrease(true, array, top);
        }
        System.out.println("Added element " + number + " to queue");
        array[top]=number;
        top++;
    }

    public int get(){
        if(isEmpty()){
            System.out.print("is empty ");
            return -1;
        }
        int temp=array[0];
        System.out.println("removing top of queue " + temp);
        for (int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[top-1]=0;
        top--;
        if(top>=4 && array.length%top==0){
            array=utility.increaseOrDecrease(false,array,top);
        }

        return temp;
    }
    //to decrease an array size if number of elements are less than space available

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