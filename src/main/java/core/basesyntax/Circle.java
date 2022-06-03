package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return (Math.PI * radius * radius) / 4;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, area: "
                + getSquare() + " sq.units , radius: "
                + radius + " units, color: " + getColor());
    }
}
