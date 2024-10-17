package core.basesyntax;

public class Circle extends Default {
    private double size;

    public Circle(String color, double size) {
        super(color);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public double getProperty() {
        return size;
    }

    @Override
    public void draw() {
        System.out.println("Circle: area: " + Math.round(getArea())
                + ", Radius: " + Math.round(getProperty()) + ", Color: " + getColor());
    }
}
