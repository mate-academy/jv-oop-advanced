package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Figure create() {
        Circle circle = new Circle();
        circle.radius = getRandom().nextInt(getMaxSize());
        circle.setColor(getColorSupplier().getRandomColor());
        return circle;
    }

    @Override
    public String draw() {
        return "Figure: cricle, area: "
                + this.getArea() + " sq.units, radius: "
                + this.radius + " units, color: "
                + this.getColor();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
