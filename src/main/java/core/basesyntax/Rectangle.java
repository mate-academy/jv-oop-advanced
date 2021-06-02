package core.basesyntax;

public class Rectangle extends Shape implements Printable, Drawable {
    private double height;
    private double width;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double figureArea() {
        return height * width;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: rectangle, area: %s, height: %s, width: %s, color: %s%n",
                figureArea(), height, width, getColor());
    }
}
