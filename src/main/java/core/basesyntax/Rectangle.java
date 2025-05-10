package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String figureProperty, String color, int length, int width) {
        super(figureProperty, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure " + getFigureProperty() + ", area: " + getParameters()
                + " sq. units, length: " + getLength() + " units, width: "
                + getWidth() + " units, color " + getColor());
    }

    @Override
    public double getParameters() {
        return length * width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
