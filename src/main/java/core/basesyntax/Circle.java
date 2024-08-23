package core.basesyntax;

public class Circle implements Figure {
    private String color;
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void getInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color:" + color);
    }
}
