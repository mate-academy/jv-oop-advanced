package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secontSide;
    private int height;

    public IsoscelesTrapezoid(
            String name, int firstSide, int secondSide, int height, String color) {
        super(name, color);
        this.firstSide = firstSide;
        this.secontSide = secondSide;
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return (firstSide + secontSide) / 2 * height;
    }
}
