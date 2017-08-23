public class Test64
{
    public static void main(String[] args)
    {
        String str1 = "First value"; String str2 = "Second value";
        String str3 = new String("First value");
        String str4 = new String("Second value");
        boolean retVal = str1.equals(str3); System.out.println(retVal);
        retVal = str1.equals(str2);
        System.out.println(retVal);
    }
}
