package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upSide;
    private int downSide;

    public IsoscelesTrapezoid(String color, int height, int upSide, int downSide) {
        super(color);
        this.height = height;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public double area() {
        return ((upSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles Trapezoid, area: " + area()
                + " sq. units, side: " + height
                + " sq. units, up: " + upSide
                + " sq. units, down: " + downSide
                + " units, color: " + getColor());
    }
}
