
public class Circle
{
    private double radius;

      //Default constructor
      //Sets the radius to 0
    Circle()
    {
        radius = 0;
    }

      //Constructor with a parameter
      //Sets the radius to the value specified by the parameter r.
    Circle(double r)
    {
        radius = r;
    }

      //Method to set the radius of the circle.
      //Sets the radius to the value specified by the parameter r.
    public void setRadius(double r)
    {
        radius = r;
    }

      //Method to return the radius of the circle.
      //Returns the radius of the circle.
    public double getRadius()
    {
        return radius;
    }

      //Method to compute and return the area of the circle.
      //Computes and returns the area of the circle.
    public double area()
    {
       return Math.PI * Math.PI * radius;
    }

      //Method to compute and return the perimeter of the circle.
      //Computes and returns the area of the circle.
    public double perimeter()
    {
       return 2 * Math.PI * radius;
    }

      //Method to return the radius, area, perimeter of the circle
      //as a string.
    public String toString()
    {
        return String.format("Radius = %.2f, Perimeter = %.2f"
                      + ", Area = %.2f%n", radius, perimeter(),
                      area());
    }
}

