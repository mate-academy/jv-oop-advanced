package core.basesyntax.figure;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, firstLeg: "
                + firstSide + " units, secondLeg: "
                + secondSide + " units, color: "
                + getColor());
    }
}
