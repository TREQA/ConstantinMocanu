public class Calc
{
    public static double add (double a, double b)
    {
        return a+b;
    }

    public static double add (double a, double b, double c)
    {
        return a+b+c;
    }


    public static void main (String[]args)
    {
        double res1 = Calc.add(4,6);
        double res2= Calc.add(4,6,8);
        System.out.println(res1);
        System.out.println(res2);
    }
}
