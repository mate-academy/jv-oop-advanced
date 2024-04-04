package core.basesyntax;

public class Square extends Figure implements Obtainable, Drawable{
    private static final String name = "Square";
    private double sideLength;
    private double area;

    public Square(Color color, double sideLength, double area, String name) {
        super(color, name);
        this.sideLength = sideLength;
    }

    @Override
    public void obtain() {
        area = sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", Area " + area
                + ", Color: " + getColor());
    }
}
