public class Test54
{
    public static void main (String[]args)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("\n" + i + ":");
            for (int u=0; u<10; u++)
            {
                System.out.println(u);
                if (u==5)
                    break;
            }
        }
    }
}
