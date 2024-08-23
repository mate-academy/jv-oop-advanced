package core.basesyntax;

public class Circle implements Figure {
    private String color;
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color:" + color);
    }
}
