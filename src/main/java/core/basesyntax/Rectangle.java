package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int heigh;

    public Rectangle(Color color, int width, int heigh) {
        super(color);
        this.heigh = heigh;
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * heigh;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + getWidth() + " units, heigh: " + getHeigh() + " units, color: "
                + getColor().name().toLowerCase());
    }
}
