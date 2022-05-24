package core.basesyntax;

public class Rectangle extends Figure {
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
    public void drawFigure() {
        System.out.println("Figure: " + name() + ", Color is "
                + getColor() + " Area = " + getArea()
                + " firstSide = " + firstSide + " secondSide = " + secondSide);
    }

    @Override
    public String name() {
        return String.valueOf(Figures.RECTANGLE);
    }
}
