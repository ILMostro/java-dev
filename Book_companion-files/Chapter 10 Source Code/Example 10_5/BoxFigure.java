
public class BoxFigure extends RectangleFigure
{
    private double height;

    public BoxFigure()
    {
        super();
        height = 0;
    }

    public BoxFigure(double l, double w, double h)
    {
        super(l, w);

        if (h >= 0)
           height = h;
        else
           height = 0;
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
        return 2 * (getLength() * getWidth()
                  + getLength() * height
                  + getWidth() * height);
    }

    public double volume()
    {
        return super.area() * height;
    }

    public String toString()
    {
        return ("Length = "  + getLength()
              + "; Width = " + getWidth()
              + "; Height = " + height
              + "\n"
              + "Surface Area = " + area()
              + "; Volume = " + volume());
    }
}

