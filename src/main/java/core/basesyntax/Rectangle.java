package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height,
                     Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Rectangle, area: "
                            + getArea()
                            + " sq.units, width: "
                            + getWidth()
                            + ", height: "
                            + getHeight()
                            + " units, color: "
                            + getColor());
    }
}
