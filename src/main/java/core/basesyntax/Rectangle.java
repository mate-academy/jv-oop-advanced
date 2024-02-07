package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color,int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, one side: " + width
                + " height " + height
                + ", color: " + getColor());
    }
}
