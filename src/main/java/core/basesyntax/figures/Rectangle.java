package core.basesyntax.figures;

public class Rectangle extends Square {
    private double side2;

    public Rectangle(String color, double side, double side2) {
        super(color, side);
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return getSide() * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + calculateArea()
                + " sq. units, " + "side1: " + getSide()
                + " units, side2: " + side2 + " units, color: "
                + getColor().toLowerCase());
    }
}
