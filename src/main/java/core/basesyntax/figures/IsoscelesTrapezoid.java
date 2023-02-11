package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int lowSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upSide, int lowSide, int height) {
        super(color);
        this.upSide = upSide;
        this.lowSide = lowSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (upSide + lowSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + ", up side: " + upSide + ", low side: " + lowSide + ", height: " + height + ", color: " + getColor());
    }
}
