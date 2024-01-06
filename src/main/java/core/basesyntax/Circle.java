package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + obtainArea()
                + " sq. units, radius: " + radius
                + " units, color: " + super.getColor());
    }

    @Override
    public int obtainArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
