package core.basesyntax;

public class Circle extends Figure {

    private final float radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String printInfo() {
        return "Figure: " + IsoscelesTrapezoid.class.getSimpleName()
                + ", area: " + getArea() + " units, radius: "
                + radius + " units, color: "
                + getColor().name().toLowerCase();
    }
}
