package core.basesyntax;

public class Figure implements AreaCalculator, Drawable {
    private String color;
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + ": " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + getHeight() + " units, secondLeg: " + getWidth()
                + " units, color: " + getColor());
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
