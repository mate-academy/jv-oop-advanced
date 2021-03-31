public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(String color, int base, int top, int height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (height / 2) * (base + top);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + ", base: "
                + Math.round(getBase()) + ", top " + Math.round(getTop()) + ", height "
                + Math.round(getHeight()) + ", color " + getColor());
    }
}
