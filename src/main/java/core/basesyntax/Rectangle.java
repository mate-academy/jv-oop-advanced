package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return String.format(Pen.TEMPLATE, FigureName.RECTANGLE.name().toLowerCase(), getArea(),
                String.format("firstSide: %d units, secondSide: %d units", firstSide, secondSide),
                getColor());
    }
}
