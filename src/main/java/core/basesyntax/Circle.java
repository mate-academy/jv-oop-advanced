package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(radius * radius * Math.PI);
    }

    @Override
    public void draw() {
        String result = "Figure: circle, area: " + this.getArea()
                + " sq. units, radius: "
                + radius + " units, color: " + getColor().toLowerCase() + System.lineSeparator();
        System.out.printf(result);
    }
}
