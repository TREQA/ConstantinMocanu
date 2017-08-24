/*Datele intră în aplicație prin intermediul următorului string:

String users = "firstName: Vladimir|lastName: Vladimirovic|firstName: Jovan|lastName: Jovanovicc|firstName: Petar|lastName: Petrovic";
Formatați datele astfel încât să obțineți următoarea ieșire:

user first name is : Vladimir, user last name is : Vladimirovic

 */

public class Exercitiul16
{
    public static void main (String[]args)
    {
        String users = "firstName: Vladimir|lastName: Vladimirovic|firstName: Jovan|lastName: Jovanovic|firstName: Petar|lastName: Petrovic";
        String[] usersArray = users.split("\\|");
        for(int i=0;i<usersArray.length;i+=2)
        {
            String firstName = usersArray[i].split(" ")[1];
            String lastName = usersArray[i+1].split(" ")[1];
            System.out.println("user first name is : " + firstName + ", user last name is : " + lastName);
        }
    }
}
