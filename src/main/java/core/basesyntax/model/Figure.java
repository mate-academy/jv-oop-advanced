package core.basesyntax.model;

public class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name().toLowerCase();
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
