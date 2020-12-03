package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double area;
    private double sideBigger;
    private double sideSmaller;
    private double height;

    public IsoscelesTrapezoid(double sideBigger, double sideSmaller,
                              double height, Color color) {
        this.sideBigger = sideBigger;
        this.sideSmaller = sideSmaller;
        this.height = height;

        super.setColor(color);

    }

    @Override
    public double getArea(double v) {
        area = ((sideBigger + sideSmaller) / 2) * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid , area : " + getArea(area) + " sq.units ,"
                            + " Bigger side : " + getSideBigger() + " units, "
                            + " Smaller side : " + getSideSmaller() + " units, "
                            + " Height length: " + getHeight() + " units, "
                            + "Color = " + super.getColor());
    }

    public double getSideBigger() {
        return sideBigger;
    }

    public double getSideSmaller() {
        return sideSmaller;
    }

    public double getHeight() {
        return height;
    }
}
