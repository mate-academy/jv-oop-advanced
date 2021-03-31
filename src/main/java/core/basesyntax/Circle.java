package core.basesyntax;

public class Circle extends Figure implements FigureArea {
    private final int radius;

    public Circle(int radius, String color, String property) {
        setColor(color);
        setProperty(property);
        this.radius = radius;
        setPropertyLength(radius);
        areaCalculate();
    }

    @Override
    public void areaCalculate() {
        setArea(Math.PI * Math.pow(radius,2));
    }
}
