package core.basesyntax;

public class Circle extends Figure implements Drawing {
    private double radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq.units," +
                " radius: " + radius + " units," +
                " color: " + color);
    }
}
