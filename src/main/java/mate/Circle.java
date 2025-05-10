package mate;

public class Circle extends Figure {

    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "circle, "
                + "area=" + Math.ceil(getArea())
                + " sq.units, radius = " + radius
                + " units, color = '" + getColor() + '\''
                + '}';
    }
}


