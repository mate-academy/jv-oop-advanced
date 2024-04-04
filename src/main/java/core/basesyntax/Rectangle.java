package core.basesyntax;

public abstract class Rectangle extends Figure implements Obtainable, Drawable {

    private static final String name = "Rectangle";
    private double length;
    private double width;
    private double area;

    public Rectangle(Color color, double length, double width, double area, String name) {
        super(color, name);
        this.length = length;
        this.width = width;
        this.area = area;
    }

    @Override
    public void obtain() {
        area = length * width;

    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", Area " + area
                + ", Color: " + getColor());
    }
}
