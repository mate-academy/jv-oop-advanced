package core.basesyntax;

public class Figure implements AreaCalculator, FigureDrawer {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Unknown basic figure");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
