package core.basesyntax;

public class Square extends Figure {
    private int width;

    public Square(int width, String color) {
        this.width = width;
        super.setFigureColor(color);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    public void draw() {
        System.out.println("Figure: square"
                + ", area: " + getArea() + " sq.units"
                + ", width: " + width
                + ", color: " + super.getFigureColor());
    }
}
