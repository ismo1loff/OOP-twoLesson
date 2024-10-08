public class Car
{
    public void Uzavto(String model)
    {
        System.out.println( model);
    }
    public void Uzavto(Float color)
    {
        System.out.println(color);
    }
    public void Uzavto(Double karopka)
    {
        System.out.println(karopka);
    }
    public void Uzavto(int narxi)
    {
        System.out.println(narxi);
    }

    public static void main(String[] args)
    {
        Car uzavto = new Car();
        uzavto.Uzavto("Gentra");
        uzavto.Uzavto("Qora");
        uzavto.Uzavto("avtomat");
        uzavto.Uzavto("16 000 $");
    }
}
