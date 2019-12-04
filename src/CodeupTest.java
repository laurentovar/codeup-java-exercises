public class CodeupTest {
    public static void main(String[] args) {

        //array of information to create an
        String[] student1 = {"Sophie", "K", "Deimos", "Macbook Pro"};

        CodeupStudent Sophie = new CodeupStudent(student1, true);
        Sophie.greeting();
        Sophie.study();
        System.out.println(Sophie.giveBusinessCard());
    }
}
