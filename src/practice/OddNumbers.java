package practice;

//print out odd numbers from 1-99
public class OddNumbers {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}
