package lab7;

/**
 *
 * @author ss0368
 */
public class Square {

    private double side;

    public Square() {

    }

    public Square(double side) throws IllegalArgumentException {
        if (side >= 0) {
            this.side = side;
        }else{
            throw new IllegalArgumentException("Side must be positive");
        }
    }

    public void setSide(double side) throws IllegalArgumentException {
        if (side >= 0) {
            this.side = side;
        }else{
            throw new IllegalArgumentException("Side must be positive");
        }
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

}
