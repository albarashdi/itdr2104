package lab6;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
  private double width;
  private double height;

  public Rectangle() {
    this.width = 1.0;
    this.height = 1.0;
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "The rectangle is created " + getDateCreated() + " and the width is " 
            + width + " and the height is " + height + " and area is "+getArea() 
            +" and perimeter is " +getPerimeter();
  }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
    // this is the answer for lab 6 part b, 1 and 2
    @Override
    public int compareTo(Rectangle o) {
            if(this.getArea()==((Rectangle) o).getArea()){
                return 0;
            }else if(this.getArea()>((Rectangle) o).getArea()){
                return 1;
            }else{
                return -1;
            }
        
    }
    
    
}
