package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("figure");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
