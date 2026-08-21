package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() { }

    @Override
    public double calculateArea() {
        return 0;
    }
}
