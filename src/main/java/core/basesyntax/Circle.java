package core.basesyntax;

public class Circle extends Figure implements Area {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
