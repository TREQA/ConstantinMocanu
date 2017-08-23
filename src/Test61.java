public class Test61
{
    public static void main(String[] args)
    {
        String str = "Welcome to ITAcademy";
        String subStr1 = "ITAcademy"; String subStr2 = "ITAcademy.com";

        System.out.print("Found Index :");
        System.out.println(str.indexOf('o'));

        System.out.print("Found Index :");
        System.out.println(str.indexOf('o', 5));

        System.out.print("Found Index :");
        System.out.println(str.indexOf(subStr1));

        System.out.print("Found Index :");
        System.out.println(str.indexOf(subStr1, 15));

        System.out.print("Found Index :");
        System.out.println(str.indexOf(subStr2));
    }

}
