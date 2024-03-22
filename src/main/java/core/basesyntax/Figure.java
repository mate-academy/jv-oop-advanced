package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }
}
