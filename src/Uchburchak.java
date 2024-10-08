public class Uchburchak
{
    public void uchburchak(int a, int b, int c)
    {
        System.out.println("Yuza = " + a * b * c);
    }
    public void uchburchak(double a, double b, double c)
    {
        System.out.println("Perimetr = " + (a + b + c));
    }

    public int sum(long a, long b, long c)
    {
        System.out.println("Perimetr = " + (a + b + c));
        return 0;
    }
    public int sum(int a, int b, int c)
    {
        System.out.println("Yuza = " + a * b * c);
        return c;
    }

    public static void main(String[] args)
    {
        Uchburchak uchburchak = new Uchburchak();
        uchburchak.uchburchak(5, 4, 3);
        uchburchak.uchburchak(5.5, 4.5, 3);

        Uchburchak add = new Uchburchak();
        add.sum(12, 15, 9);
        add.sum(5L, 4L, 3L);
    }
}
