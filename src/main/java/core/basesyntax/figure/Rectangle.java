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
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
