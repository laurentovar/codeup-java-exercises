import java.util.Arrays;



public class ArraysExeercises {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers);
            //it gives you the hidden "id" of the array [I@2d209079

            //an array that holds 3 person objects, iterate and print out each name
            String [] persons = {"Scobby Doo", "Fred Jones", "Velma Dinkley"};
            for (String person: persons){
                System.out.println(person);
            }

                String[] people = Arrays.copyOf(persons, 4);
                            System.out.println(Arrays.toString(people));
                            people[3] = "Shaggy";
                             System.out.println(Arrays.toString(people));

        }
        //make static method named addPerson. accept an array of person objects as well as a single person
            //to add to the passed array. It should return an array whose length is 1 > than passed array
             String  person;
            public  void addPerson (String name) {
                person = name;
            }

}

