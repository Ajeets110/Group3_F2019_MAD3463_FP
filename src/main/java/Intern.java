public class Intern extends Employee implements IPrintable {

    //V a r i a b l e    D e c l a r a t  i o  n

    private String schoolName;


    //O v e r r i d i n g 
    @Override

    public void printMyData()
    {
        System.out.println("School Name  :" + schoolName);
    }


}
