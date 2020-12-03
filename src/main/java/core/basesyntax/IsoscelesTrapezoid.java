package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double area;
    private double sideBigger;
    private double sideSmaller;
    private double height;
    private Color color;

    public IsoscelesTrapezoid(double sideBigger, double sideSmaller,
                              double height, Color randomColorIndex) {
        this.sideBigger = sideBigger;
        this.sideSmaller = sideSmaller;
        this.height = height;
        this.color = randomColorIndex;

        draw();
    }

    @Override
    public Enum getColor() {
        setColor(color);
        return super.getColor();
    }

    @Override
    public void setColor(Enum color) {
        super.setColor(color);
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    @Override
    public double getArea() {
        setArea(((sideBigger + sideSmaller) / 2) * height);
        return super.getArea();
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid , area : " + getArea() + " sq.units ,"
                            + " Bigger side : " + getSideBigger() + " units, "
                            + " Smaller side : " + getSideSmaller() + " units, "
                            + " Height length: " + getHeight() + " units, "
                            + "Color = " + getColor());
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
