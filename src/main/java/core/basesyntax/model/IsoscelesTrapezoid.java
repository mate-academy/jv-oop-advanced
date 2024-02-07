package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topSide;
    private double bottomSide;

    public IsoscelesTrapezoid(String color, double height, double topSide, double bottomSide) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public double getArea() {
        return height * ((bottomSide + topSide) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", square: " + getArea() + " sq.units, color: "
                + ", height: " + height
                + getColor() + ", bottomSide: " + bottomSide
                + ", topside: " + topSide);
    }
}
