
public class BoxShape extends RectangleShape
{
    protected double height;

    public BoxShape()
    {
       super();
       height = 0;
    }

    public BoxShape(double l, double w, double h)
    {
       super(l, w);
       height = h;
    }

    public void setDimension(double l, double w, double h)
    {
        super.setDimension(l, w);

        if (h >= 0)
            height = h;
        else
            height = 0;
    }

    public double getHeight()
    {
        return height;
    }

    public double area()
    {
        return  2 * (length * width + length * height + width * height);
    }

    public double volume()
    {
        return length * width * height;
    }

    public String toString()
    {
        return ("Length = "  + length
              + ", Width = " + width
              + ", Height = " + height
              + ", Surface Area = " + area()
              + ", Volume = " + volume());
    }
}
