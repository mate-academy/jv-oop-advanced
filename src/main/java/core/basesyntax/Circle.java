package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: cricle, area: "
                + this.getArea() + " sq.units, radius: "
                + this.radius + " units, color: "
                + this.getColor();
    }
}
