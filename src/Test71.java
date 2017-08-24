public class Test71
{
    public static void main (String[]args)
    {
        String str = "This is a sentence. This is a question, right? Yes! It is.";

        System.out.println("Return Value:");
        String[] wordArray = str.split("[ .,?!]+");
        for (int i=0; i<wordArray.length; i++)
        {
            System.out.println(wordArray[i]);
        }
    }
}
