package core.basesyntax.model;

public class Figure implements AreaCalculator, Drawable {
    private Color color;

    public String getColor() {
        return color.name();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }
}
