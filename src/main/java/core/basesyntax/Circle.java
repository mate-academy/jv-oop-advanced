package core.basesyntax;

public class Circle extends Figure implements Behavior{
    private  int radius;

    public int getRadius() {
        return radius;
    }

    public void getCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
