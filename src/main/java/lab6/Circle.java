package lab6;

public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override
  public String toString() {
    return "The circle is created " + getDateCreated() + " and the radius is " 
            + radius+ " and area is "+getArea() +" and perimeter is " +getPerimeter();
  }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
