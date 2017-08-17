import java.util.Arrays;

public class Test24
{
    public static void main (String[]args)
    {
        int[] a={5,1,3,4,2};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,2));
        System.out.println(Arrays.binarySearch(a,6));
    }
}
