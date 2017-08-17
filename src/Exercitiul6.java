import java.util.Arrays;

public class Exercitiul6
{
    public static void main (String[]args)
    {
        int[] array = {1,5,33,563,0,2,23,9,9,11,987,23,934,999,43};
        System.out.println("This is array"+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("This is sorted array"+Arrays.toString(array));
    }
}
