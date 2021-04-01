package core.basesyntax;

public class Trapezoid extends Figure {
    private int height;
    private int midline;

    public Trapezoid(int height, int midline, Color color) {
        super(color);
        this.height = height;
        this.midline = midline;
    }

    @Override
    public void draw() {
        System.out.println("I am " + getColor()
                + " trapezoid, my height is " + height
                + " my midline is " + midline
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return height * midline;
    }
}
