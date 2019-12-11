package practice.arrays;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int [] intArray1 = new int[] {1,2,3,4,5,6};

        //get the length of the array
        int length = intArray1.length;

        System.out.println("Length of the array: "+ length);

        //find a specific element in the array
        int x = intArray1[2]; //should be 3
        System.out.println("Find the number in the index 2: " + x);


        //replacing an element of the array
        intArray1[3] = 8;

        //iterating through the array

        for (int i =0; i<= intArray1.length -1; i++){
            System.out.println(intArray1[i]);
        }


        //get the range of elements
        int[] arr2 = Arrays.copyOfRange(intArray1, 1, 3);

        System.out.println("New array: ");
        for (int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }


}
