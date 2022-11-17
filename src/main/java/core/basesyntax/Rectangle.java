package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Color color, int width, int height) {
        super("rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getShape()
                + ", area: " + this.getArea()
                + " sq.units, width: " + this.width
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }
}
