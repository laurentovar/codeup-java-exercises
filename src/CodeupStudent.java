public class CodeupStudent extends Student {

    public CodeupStudent(String [] information, boolean graduated){

        this.firstName = information[0];
        this.lastName = information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;
    }
    public void greeting (){
        System.out.println("Hello" + cohort);
    }
    public void study (){
        System.out.println("Full-stack java curriculum");
    }
    public boolean giveBusinessCard(){
        if (graduated){
            return true;
        }
        else{
            return false;
        }
    }
}
