package core.basesyntax;

public class Rectangle extends FigureAbstract {
    private static Rectangle rectangle = new Rectangle();
    private int length;
    private int width;
    private int area;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
        area = getArea();
    }

    public Rectangle() {

    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                rectangle.getClass().getSimpleName().toLowerCase()
                +
                ", area: " + area
                +
                ", length: " + length
                +
                ", width: " + width
                +
                ", color: " + getColor());
    }
}
