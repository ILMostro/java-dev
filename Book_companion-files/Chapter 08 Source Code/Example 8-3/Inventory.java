
public class Inventory
{
    private String name;
    private int itemNum;
    private double price;
    private int unitsInStock;

    public Inventory()                           //Constructor 1
    {
        name = "";
        itemNum = -1;
        price = 0.0;
        unitsInStock = 0;
    }

    public Inventory(String n)                   //Constructor 2
    {
        name = n;
        itemNum = -1;
        price = 0.0;
        unitsInStock = 0;
    }

    public Inventory(String n, int iNum,
                     double cost)                //Constructor 3
    {
        name = n;
        itemNum = iNum;
        price = cost;
        unitsInStock = 0;
    }

    public Inventory(String n, int iNum, double cost,
                     int inStock)                //Constructor 4
    {
        name = n;
        itemNum = iNum;
        price = cost;
        unitsInStock = inStock;
    }

    //Add additional methods
}
