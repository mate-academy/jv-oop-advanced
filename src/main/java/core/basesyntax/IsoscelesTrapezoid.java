package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(
            String name, int firstSide, int secondSide, int height, String color) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + "color: " + getColor()
                + "first side: " + getFirstSide()
                + "second side: " + getSecondSide()
                + "height: " + getHeight();
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
