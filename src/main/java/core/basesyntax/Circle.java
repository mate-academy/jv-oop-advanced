package core.basesyntax;

public class Circle implements Area, Draw {
    private int radius;
    private String color;

    public int getRadius() {
        return radius;
    }

    public void getCircle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        draw();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius "
                + getRadius() + " units, color: " + color);
    }
}
