package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.secondSide = secondSide;
        this.firstSide = firstSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculateArea() + " units, firstSide "
                + firstSide + " units, secondSide " + secondSide + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
