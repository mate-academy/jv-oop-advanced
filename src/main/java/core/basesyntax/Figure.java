package core.basesyntax;

public class Figure implements Drawable, AreaCalculator, PerimeterCalculator {
    private String defColor;

    public Figure() {
    }

    public Figure(String color) {
        this.defColor = color;
    }

    public String getDefColor() {
        return defColor;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
