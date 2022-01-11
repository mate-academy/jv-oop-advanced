package core.basesyntax;

public class Circle extends Figures implements Behaviour {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String setColor() {
        return super.setColor();
    }
}
