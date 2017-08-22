public class Shape
{
    public String color;
    public int x;
    public int y;
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.r = 12;
        c.color = "red";
        c.x = 100;
        c.y = 200;
        System.out.println(c.area());
    }
}


