package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private double top;
    private double bottom;
    private double height;

    public IsoscelesTrapezoid(String color, double top, double bottom, double height) {
        super(Colors.valueOf(color));
        this.top = Math.round(Math.abs(top));
        this.bottom = Math.round(Math.abs(bottom));
        this.height = Math.round(Math.abs(height));
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Shape: isosceles trapezium, area: " + calculateArea()
                + ", top: " + getTop()
                + ", bottom: " + getBottom()
                + ", height: " + getHeight()
                + ", color: " + getColor());
    }
}
