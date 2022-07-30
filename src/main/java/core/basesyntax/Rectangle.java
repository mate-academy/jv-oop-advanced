package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
