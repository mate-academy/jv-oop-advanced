package core.basesyntax;

public class Circle implements Figure {
    final int radius;
    private String color;

    public Circle(int radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + "radius: " + radius + ",color: " + color);
    }
}

