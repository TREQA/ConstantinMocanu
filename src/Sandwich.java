public class Sandwich extends Product
{
    public Sandwich(String name, double price)
    {
        this.additions = new String[10];
        this.name = name;
        this.price = price;
    }
    public double countPrice()
    {
        return this.price + this.price*0.15;
    }
}