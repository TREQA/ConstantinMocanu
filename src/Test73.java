public class Test73
{
    public enum DaysOfWeek
    {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        public int position;
        DaysOfWeek(int i)
        { this.position = i; }
    }
        public static void main (String[]args)
        {
            System.out.println(DaysOfWeek.FRIDAY.position);

            for (DaysOfWeek dow : DaysOfWeek.values())
            {
                System.out.println(dow);
            }

            for (int i=0; i<DaysOfWeek.values().length; i++)
            {
                System.out.println(DaysOfWeek.values()[i]);
            }
        }
}



