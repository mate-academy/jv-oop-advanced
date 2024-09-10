package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void returnInfo() {
        System.out.println("Figure: circle, area: " + Math.round(Math.PI * radius * radius)
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
