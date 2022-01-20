package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double topSide,
                              double bottomSide, double height) {
        super(name, color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        setArea(((topSide + bottomSide) / 2) * height);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, topSide: " + this.topSide
                + "units, " + " bottomSide: " + this.bottomSide + " units, "
                + "height: " + this.height + "units, "
                + "color: " + getColor());
    }
}
