public class ReferenceType
{
    public int x = 5;

    public static void main (String[]args) {
        ReferenceType rt = new ReferenceType();
        System.out.println("This is the initial value:" + rt.x);
        passMethod(rt);
        System.out.println("This is the value after the completion of the method:" + rt.x);
    }
    public static void passMethod(ReferenceType rt)
    {
        rt.x =10;
        System.out.println("This is the value from method:" +rt.x);
    }
}
