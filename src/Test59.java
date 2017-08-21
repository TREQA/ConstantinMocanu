public class Test59
{
    public static void main (String[]args)
    {
        int x=5;
        System.out.println("This is initial value:" + x);
        passMethod(x);
        System.out.println("This is the value after completion of the method:" +x);
    }
    public static void passMethod(int x)
    {
        x=10;
        System.out.println("This is the value from the method:" +x);
    }
}
