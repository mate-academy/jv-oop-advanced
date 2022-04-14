package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        setSquare(side1 * side2);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: rectangle\narea: " + getSquare() + " sq.units\none side: "
                + side1 + " units\nanother side " + side2 + " units\ncolor: " + getColor());
    }
}
