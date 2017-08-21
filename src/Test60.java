public class Test60
{
    public static void main (String[]args)
    {
        getPerimeter (13, 13, 13);
    }
    public static void getPerimeter (int... edges)
    {
        int perimeter = 0;
        if (edges.length < 3)
        {
            System.out.println("Polygon must have more than two sides.");
        }
        else {
            for (int i=0; i< edges.length; i++)
            {
                perimeter += edges[i];
            }
            System.out.println(perimeter);
        }
    }
}
