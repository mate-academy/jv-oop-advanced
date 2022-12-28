package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    int side1;
    int side2;

    public Rectangle(Colors color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void PrintInfo() {
       System.out.println(" Figure: rectangle, area:  " + getArea() + " sq.units, side1: " + side1 + " ,units, side2: " + side2 + " units, color: " + getColor());
    }
}
