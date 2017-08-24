/* În aplicație intră o listă de fișiere sub forma unui string.
Trebuie recunoscute doar fișierele de tip jpg, png sau gif (prin utilizarea extensiilor acestora) și afișat un mesaj despre tipul lor la ieșire:
    Fișierul: picture1.jpg este de tip jpg
    Fișierul: picture2.png este de tip png
    Fișierul: picture3.gif este de tip gif

    Parametrul de intrare:
String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };  */

public class Exercitiul15
{
    public static void main (String[]args)
    {
        String[] files = {"picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture.gif"};

        for (int i=0; i<files.length; i++)
        {
            if (files[i].endsWith(".jpg"))
                System.out.println("Fisierul: " + files[i] + " este de tip jpg");

            if (files[i].endsWith(".png"))
                System.out.println("Fisierul: " + files[i] + " este de tip png");

            if (files[i].endsWith(".gif"))
                System.out.println("Fisierul: " + files[i] + " este de tip gif");
        }
    }

}
