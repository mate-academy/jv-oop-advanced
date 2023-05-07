package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = (double) Math.round(Math.PI * radius * radius);
        System.out.println("Figure: circle, area: " + area + " sq.units, radius: "
                + radius + " units, color: " + getColor().toLowerCase());

    }
}
