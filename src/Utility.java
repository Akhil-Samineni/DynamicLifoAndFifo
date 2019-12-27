public class Utility {
    public Utility(){

    }

    public int[] increaseOrDecrease(boolean flag,int[] array, int top){
        System.out.println("increase or decrease caled " + array.length);
        int[] newarray;
        if(flag){
            if(array.length==0)
                newarray=new int[4];
            else
                newarray=new int[2*array.length];
        }else{
            newarray=new int[array.length/2];
        }
        copy(newarray,array,top);
        return newarray;
    }


    public int[] copy(int[] newarray, int[] array,int top){
        for(int i=0;i<top;i++){
            newarray[i]=array[i];
        }
        return newarray;
    }

    public int arraySize(int[] array){
        return array.length;
    }
    public void print(int top,int[] array){
        System.out.print("Stack: ");
        for (int i=0;i<top;i++){
            System.out.print(array[i] +  " ");
        }
        System.out.println("");
    }



}
