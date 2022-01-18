public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(double base, double top, double height) {
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public double findArea() {
        return (base + top) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + findArea()
                + " sq.units, base: " + base + " units, top: " + top
                + " units, height: " + height + " units, color: " + getColor());
    }
}
