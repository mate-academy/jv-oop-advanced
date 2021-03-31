package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, String color, String property) {
        setColor(color);
        setProperty(property);
        this.height = height;
        this.width = width;
        setPropertyLength(width);
        areaCalculate();
    }

    @Override
    public void areaCalculate() {
        setArea(height * width);
    }
}
