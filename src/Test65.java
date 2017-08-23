public class Test65
{
    public static void main(String[] args)
    {
        String str1 = "First value";
        String str2 = new String("First value");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}

