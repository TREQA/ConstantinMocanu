//class definition
class MyClass
{
    public static int myVariable;
}
public class Test8
{
    public static void main(String[] args)
    {

        MyClass.myVariable = 10;    //initialization of field
        System.out.println(MyClass.myVariable);    //display field value
    }
}
