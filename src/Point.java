public class Point
{
    int x;
    int y;
    int z;
    public Point()
    {
        System.out.println("Salom Student");
    }
    public Point(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void print()
    {
        System.out.println(x + ":" + y + ":" + z);
    }
    public static void main(String[] args)
    {

    }
}
