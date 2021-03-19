import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
    }

    public static int  smallest(int[] intArray){
        int smallestNo=intArray[0];
        for(int item:intArray){
            if (item<smallestNo){
                smallestNo=item;

            }
        }
        return smallestNo;

    }

    public static int indexOfSmallest(int[] array){
        int smallestNo=smallest(array);
        int indexSmallestNo=0;
        for (int index=0;index<array.length;index++ ){
            if (array[index]==smallestNo){
//                System.out.println(index);
                indexSmallestNo = index;
                break;

            }
        }
        return indexSmallestNo;


    }

    public static int indexOfSmallestFrom(int[] array,int startIndex){
        int smallestNo=array[startIndex];
        int indexSmallestNo=startIndex;
        for (int index=startIndex;index<array.length;index++ ){
            if (array[index]<smallestNo){
                smallestNo=array[index];
                indexSmallestNo=index;

            }
//

        }
        return indexSmallestNo;


    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here


        int tempNo=array[index1];
        array[index1]=array[index2];
        array[index2]=tempNo;
    }

    public static void sort(int[] array) {

        for (int startIndex=0;startIndex<array.length-1;startIndex++){
            int indexSmallestNo=indexOfSmallestFrom(array, startIndex);
            swap(array,startIndex,indexSmallestNo);
            System.out.println(Arrays.toString(array));
        }

    }



}
