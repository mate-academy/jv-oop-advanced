package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
