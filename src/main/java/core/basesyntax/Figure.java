package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("I am just a figure");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
