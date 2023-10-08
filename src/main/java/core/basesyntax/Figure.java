package core.basesyntax;

public class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 1.00000;
    }

    @Override
    public void draw() {

    }
}
