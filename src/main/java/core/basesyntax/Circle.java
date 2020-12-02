package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setName() {
        super.setName("Circle");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea() {
        super.setArea((int) (Math.PI * radius));
    }

    @Override
    public String uniqueFunction() {
        return Integer.toString((int) getRadius());
    }

    @Override
    public double getArea() {
        return 0;
    }
}
