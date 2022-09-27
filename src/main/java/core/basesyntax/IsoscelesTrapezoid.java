package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public String getName() {
        return Figures.ISOSCELESTRAPEZOID.name().toLowerCase();
    }

    @Override
    public double area() {
        return ((double) topSide + bottomSide) / 2 * height;
    }

    @Override
    public void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", area " + area() + " sq.units, topSide: "
                + topSide + ", bottomSide: " + bottomSide
                + ", height: " + height + ", color: " + getColor());
    }
}
