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
    public double getArea() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid, "
                + "getArea: " + getArea() + " sq.units, "
                + "top side: " + this.topSide + " units, "
                + "bottom side: " + this.bottomSide + " units, "
                + "height: " + this.height + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
