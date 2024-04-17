package core.basesyntax.figures;

public class Rectangle extends Square {
    private double side;

    public Rectangle(String color, double side, double side2) {
        super(color, side);
        this.side = side2;
    }

    public double getSide2() {
        return side;
    }

    public void setSide2(double side2) {
        this.side = side2;
    }

    @Override
    public double calculateArea() {
        return getSide() * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + calculateArea()
                + " sq. units, " + "side1: " + getSide()
                + " units, side2: " + side + " units, color: "
                + getColor().toLowerCase());
    }
}
