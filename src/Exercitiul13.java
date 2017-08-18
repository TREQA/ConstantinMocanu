/*Este dat următorul şir de numere:
int[] arr = {1,2,3,4,5,6,7,8,9,10};
Trebuie să listăm şirul dat folosind
bucla do-while

 */

public class Exercitiul13
{
    public static void main (String[]args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 0;
        do {
            System.out.println(arr[x]);
            x++;
        } while (x<arr.length);
    }
}
