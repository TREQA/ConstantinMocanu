/* Trebuie create 3 clase.
Prima este clasa Circle şi ea conţine proprietatea r (raza).
A doua clasă este Rectangle şi conţine proprietăţile a şi b.
A treia clasă se numeşte Calc şi conţine metoda statică area care,
ca parametru, acceptă o instanţă a clasei (Circle sau Rectangle),
iar ca rezultat prezintă aria formei introduse.
În funcţie dacă în metodă a intrat instanţa clasei Circle sau Rectangle,
 va fi executată formula de calculare a ariei pentru Circle sau Rectangle.  */

import java.util.SortedMap;

public class Calc
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(56);
        System.out.println(Calc.Area(Circle.class));
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println(Calc.Area(Rectangle.class));

    }

    public static double Area(Object shape)
    {
        shape.getClass();
        if (shape.getClass()==Circle.class)
        {
            double pi = 3.14;
            Circle circle = new Circle(double constructor_radius);
            double Area = pi *(circle.radius*circle.radius);
            return Area;
        }
        else if (shape.getClass() == Rectangle.class)
        {
            Rectangle rectangle = new Rectangle(double side_a, double side_b);
            double Area = rectangle.a * rectangle.b;
            return Area;
        }
        return 0;
    }
}

