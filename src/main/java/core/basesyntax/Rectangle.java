package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
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
        System.out.println("Rectangle("
                + "color: " + color
                + ", width: " + firstSide
                + ", height: " + secondSide
                + ", area: " + getArea()
                + ")");

    }
}
