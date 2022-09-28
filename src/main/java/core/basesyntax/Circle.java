package core.basesyntax;

public class Circle extends Figure {

    private float radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(name()).append(", area: ")
                .append(getArea()).append(" units, radius: ")
                .append(radius).append(" units, color: ")
                .append(getColor());
        return sb.toString();
    }

}
