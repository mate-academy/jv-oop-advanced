package core.basesyntax;

public class Rectangle extends Figure implements FigureInterface, DrawFigure {
    private final int height;
    private final int width;

    public Rectangle(String color,int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getFigureArea() {
        return width * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle"
                + "\n"
                + "Figure Area:"
                + getFigureArea()
                + "\n"
                + "HeightRectangle: "
                + height
                + "\n"
                + "WidthRectangle: "
                + width
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

    @Override
    public String toString() {
        return "Figure: Rectangle"
                + "\n"
                + "Figure Area:"
                + getFigureArea()
                + "\n"
                + "HeightRectangle: "
                + height
                + "\n"
                + "WidthRectangle: "
                + width
                + "\n"
                + "Color: "
                + getColor()
                + "\n";
    }
}
