public class Test9
{
    static int variableA;   //variabila de clasa
    //variabile de instanta
    int variableB;
    String variableC;
    boolean variableD;

    public static void main (String[]args)
    {
        Test9 class1=new Test9();

        System.out.println(variableA);
        System.out.println(class1.variableB);
        System.out.println(class1.variableC);
        System.out.println(class1.variableD);
    }
}
