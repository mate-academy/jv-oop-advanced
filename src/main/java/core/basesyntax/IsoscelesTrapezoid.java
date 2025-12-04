package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int median;
    private int height;

    public IsoscelesTrapezoid(String color, int median, int height) {
        super(color);
        this.median = median;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    @Override
    public double area() {
        return median * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area() + " sq. units, median: " + median
                + ", height: " + height + " units, color: "
                + getColor());
    }
}
