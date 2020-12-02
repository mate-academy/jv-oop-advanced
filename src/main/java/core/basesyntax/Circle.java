package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        calculate();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq. units, radius: " + radius
                + ", color: " + color);
    }

    @Override
    public void calculate() {
        area = Math.PI * (getRadius() * getRadius());
    }

    public int getRadius() {
        return radius;
    }
}
