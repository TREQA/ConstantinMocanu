/*În aplicaţie intră şirul următor:
String[][] users = { { "petar" , "petrovic" , "1111" }, {"jovan","jovanovic","2222"} ,
{"zoran","ivanovic","3333"}  };
Trebuie să separăm numele utilizatorilor şi să le stocăm într-un şir separat.
Acest şir trebuie emis la ieşire.    */

import java.util.Arrays;

public class Exercitiul11
{
    public static void main (String[]args)
    {
        String[][] users = {
                {"petar", "petrovic", "1111"},
                {"jovan", "jovanovic", "2222"},
                {"zoran", "ivanovic", "3333"}    };
        String[] names = new String[users.length];
        for (int i=0; i<users.length; i++)
            names[i]=users[i][0];
        System.out.println(Arrays.toString(names));
    }
}
