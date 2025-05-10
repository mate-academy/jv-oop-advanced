package core.basesyntax.model;

public class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtainArea()
                + " sq.units, side: " + getSideA()
                + " units, color: " + getColor());
    }
}
