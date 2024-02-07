package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int lateralSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int lateralSide, int height) {
        super(color);
        this.topSide = topSide;
        this.lateralSide = lateralSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + lateralSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, "
                + "Area: " + getArea()
                + " topSide: " + this.topSide
                + " lateralSide: " + this.lateralSide
                + " height: " + this.height
                + " color: " + super.color);
    }
}
