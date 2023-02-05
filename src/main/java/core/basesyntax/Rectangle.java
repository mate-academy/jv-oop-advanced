package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateFigureArea() {
        return height * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.2f", calculateFigureArea())
                + " sq.units, height: " + height + " units, width: " + width
                + " units, color: " + getColor());
    }
}
