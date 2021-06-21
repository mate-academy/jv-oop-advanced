package core.basesyntax;

public class Circle extends Figure implements GetArea {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String printInfo() {
        return "Figure: cirle, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, radius: " + (int) getRadius() + " units, color: " + getColor();
    }
}
