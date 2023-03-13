package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseLarge;
    private int baseSmall;
    private int height;

    public IsoscelesTrapezoid(int baseLarge, int baseSmall, int height, String color) {
        super(color);
        this.baseLarge = baseLarge;
        this.baseSmall = baseSmall;
        this.height = height;
    }

    public double getBaseLarge() {
        return baseLarge;
    }

    public void setBaseLarge(int baseLarge) {
        this.baseLarge = baseLarge;
    }

    public double getBaseSmall() {
        return baseSmall;
    }

    public void setBaseSmall(int baseSmall) {
        this.baseSmall = baseSmall;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseLarge + baseSmall) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, baseLarge: " + getBaseLarge()
                + " units, baseSmall: " + getBaseSmall()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
