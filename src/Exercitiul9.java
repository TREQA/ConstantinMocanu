/* Avem următoarele date de intrare pentru un automobil:
String carMake = "Ford";
int doors = 4;
Trebuie să se facă o structură condițională care va verifica
dacă producătorul automobilului este Ford și, dacă este,
în funcție de numărul de uși, să afișeze mesajul adecvat.
 */

public class Exercitiul9
{
    public static void main(String[] args)
    {
        String carMake = "Ford";
        int doors = 4;
        if (carMake == "Ford") {
            System.out.println("Car is made by Ford");
        switch (doors) {
            case 2:
                System.out.println("Car has 2 doors");
                break;
            case 4:
                System.out.println("Car has 4 doors");
                break;
            }
        }
        else
            System.out.println("Car is not made by Ford");


    }
}