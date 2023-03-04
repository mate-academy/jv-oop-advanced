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
        return 0;
    }

    public void drawFigure() {
        System.out.println("Figure color: " + color);
    }
}
