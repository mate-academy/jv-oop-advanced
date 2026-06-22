package core.basesyntax;

public class Circle extends Figure implements Drawnable {
    private int radius;

    public Circle(String color, int i) {
        super(color);
        this.radius = i;
    }

    @Override
    public void toDraw() {
        System.out.println("Circle, radius: " + radius + "\n area " + getArea());
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
