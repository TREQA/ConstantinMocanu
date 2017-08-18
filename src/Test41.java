public class Test41
{
    public static void main (String[]args)
    {
        int x = 4;
        switch (x)  {
            case 1:
            case 2:
            case 3:
                System.out.println("No. is 1, 2 or 3!");
                break;
                default:
                    System.out.println("No. is NOT 1, 2 or 3");
                    break;
        }
    }
}
