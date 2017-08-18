/*Trebuie să verificăm restul împărţirii dintre x şi y.
Dacă nu există rest, trebuie să se afişeze mesajul că restul nu există,
în caz contrar, trebuie să se verifice dacă restul este mai mare sau mai mic decât o mie
şi să se afişeze mesajul corespunzător*/

public class Exercitiul8
{
    public static void main (String[]args)
    {
        int x = 523134;
        int y = 325423;
        int modulo = x%y;
        switch (modulo) {
            case 0:
                System.out.println("Restul nu exista");
                break;
            default:
                if (modulo<1000)
                    System.out.println("Restul este mai mic decat 1000");
                else
                    System.out.println("Restul este mai mare decat 1000");
                break;
        }
    }
}
