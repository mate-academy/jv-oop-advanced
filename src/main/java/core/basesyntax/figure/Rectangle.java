package core.basesyntax.figure;

public class Rectangle extends Square {
    private final int secondSide;

    public Rectangle(String color, int side, int secondSide) {
        super(color, side);
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return side * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq. units, side: "
                + side + " units, " + secondSide + " color: " + color);
    }
}
