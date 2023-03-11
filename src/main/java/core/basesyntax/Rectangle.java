package core.basesyntax;

public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
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
        System.out.println("Rectangle: color = "
                + getColor()
                + ", width = "
                + width
                + ", height = "
                + height + ", area = "
                + getArea() + " sq.units.");
    }
}
