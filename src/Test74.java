public class Test74
{
    public enum DaysOfWeek {MONDAY, TUESDAY, WEDNSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; }

    public static void main (String[]args)
    {
        DaysOfWeek daysOfWeek = DaysOfWeek.WEDNSDAY;
            switch (daysOfWeek)
            {
                case MONDAY:
                    System.out.println("Day is MONDAY");
                    break;
                case TUESDAY:
                    System.out.println("Day is TUESDAY");
                    break;
                case WEDNSDAY:
                    System.out.println("Day is WEDNSDAY");
                    break;
                case THURSDAY:
                    System.out.println("Day is THURSDAY");
                    break;
                case FRIDAY:
                    System.out.println("Day is FRIDAY");
                    break;
                case SATURDAY:
                    System.out.println("Day is SATURDAY");
                    break;
                case SUNDAY:
                    System.out.println("Day is SUNDAY");
                    break;
            }
    }
}
