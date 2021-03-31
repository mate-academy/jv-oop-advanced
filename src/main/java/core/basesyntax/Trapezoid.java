package core.basesyntax;

public class Trapezoid extends Figure implements Shape {
    private int height;
    private int midline;

    public Trapezoid(int height, int midline, Color color) {
        this.height = height;
        this.midline = midline;
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println("I am " + color.toString().toLowerCase()
                + " rectangle, my height is " + height
                + " my midline is " + midline
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return height * midline;
    }
}
