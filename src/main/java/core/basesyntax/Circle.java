package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        radius = random.nextDouble();
        color = Color.values()[random.nextInt(Color.values().length)].name();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq.units, radius: " + radius
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
