package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double side;
    private double side2;

    public Rectangle(String color, double side, double side2) {
        super(color);
        this.side = side;
        this.side2 = side2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + calculateArea()
                + " sq. units, side1: " + side
                + " units, side2: " + side2 + " units, color: "
                + getColor().toLowerCase());
    }
}
