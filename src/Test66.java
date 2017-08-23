public class Test66
{
    public static void main(String[]args)
    {
        String str = "Welcome to ITAcademy";
        System.out.print("Return Value :");
        System.out.println(str.startsWith("Welcome"));
        System.out.print("Return Value :");
        System.out.println(str.startsWith("ITAcademy"));
        System.out.print("Return Value :");
        System.out.println(str.startsWith("ITAcademy", 11));
    }
}
