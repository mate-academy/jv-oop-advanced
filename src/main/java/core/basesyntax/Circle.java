package core.basesyntax;

public class Circle extends Figure {
    private final Round round = new Round();
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return round.toRound(Math.PI * Math.pow(radius, 2));
    }

    public void toDraw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }
}
