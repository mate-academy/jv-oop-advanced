package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        this();
        this.length = length;
        this.width = width;
        setColor(color);
        calculateArea();
    }

    public Rectangle() {
        super(FigureTypeName.RECTANGLE.name());
    }

    @Override
    public void calculateArea() {
        setArea(length * width);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "length: " + length + " units, width: " + width + " units,"
                + "color: " + getColor()
        );
    }
}
