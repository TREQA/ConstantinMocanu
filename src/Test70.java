public class Test70
{
    public static void main (String[]args) {
        String str = "Welcome-to-ITAcademy";

        System.out.println("Return Value:");
        String[] wordArray1 = str.split("-");
        for (int i = 0; i < wordArray1.length; i++) {
            System.out.println(wordArray1[i]);
        }

        System.out.println("Return value:");
        String[] wordArray2 = str.split("-", 2);
        for (int i = 0; i < wordArray2.length; i++)
        {
            System.out.println(wordArray2[i]);
        }
    }
}
