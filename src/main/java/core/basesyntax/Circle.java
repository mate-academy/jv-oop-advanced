package core.basesyntax;

public class Circle implements Figure {
    private final int radius;
    private final String color;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Circle," +
                "area:" + getArea() + " sq.units,radius:" +
                radius + " units,color:" + color);
    }
}
