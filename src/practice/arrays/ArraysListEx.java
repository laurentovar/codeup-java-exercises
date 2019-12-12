package practice.arrays;

import java.util.ArrayList;

public class ArraysListEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(23);
        arrayList.add(14);
        arrayList.add(89);
        arrayList.add(6);
        arrayList.add(42);
        arrayList.add(1);

        //get specific element
        int x= arrayList.get(2); //should be 14
        System.out.println(x);

        //get range of elements and put into a new array
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList.subList(0,3));

        //print out arraylist1
        System.out.println(arrayList2);

        //replacing an element
        arrayList.set(1,70);//replaces index1 with 70

        //iterate through arraylist (USE SIZE not Length)
        for (int i=0; i <= arrayList.size() -1; i++){
            System.out.println(arrayList.get(i));
        }

    }



}
