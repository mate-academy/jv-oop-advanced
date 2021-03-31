public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(String color, double base, double top, double height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getTop() {
        return top;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round(((height / 2) * (base + top) * 100) / 100.0);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + ", base: "
                + Math.round(getBase()) + ", top " + Math.round(getTop()) + ", height "
                + Math.round(getHeight()) + ", color " + getColor());
    }
}
