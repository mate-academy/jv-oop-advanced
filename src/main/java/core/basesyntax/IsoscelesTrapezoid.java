package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int upSide;
    private int height;

    public IsoscelesTrapezoid(String color, int baseSide, int upSide, int height) {
        super(color);
        this.baseSide = baseSide;
        this.upSide = upSide;
        this.height = height;
    }

    public int getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(int baseSide) {
        this.baseSide = baseSide;
    }

    public int getUpSide() {
        return upSide;
    }

    public void setUpSide(int upSide) {
        this.upSide = upSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq.units, baseSide: " + baseSide
                + " units, upSide: " + upSide
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (height / 2.0) * (baseSide + upSide);
    }
}
