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
        return "Figure: " + this.getName()
                + ", area: " + this.getAria() + " sq.units, "
                + "color: " + this.getColor();
    }

    @Override
    public double getAria() {
        return (firstSide + secontSide) / 2 * height;
    }
}
