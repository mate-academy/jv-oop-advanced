package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    protected Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%s",
                "Figure: circle, area: ", this.getArea(), " sq. units, radius length: ",
                this.getRadius(), " units, color: ", this.getColor()));
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
