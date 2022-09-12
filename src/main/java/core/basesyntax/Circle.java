package core.basesyntax;

public class Circle extends Figure {
    private float radius = getSomething();

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public StringBuilder printInfo() {
        setName("circle");
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append(getName()).append(", ")
                .append("area: ").append(getArea())
                .append(" cr.units, radius: ").append(radius)
                .append(" units, color: ").append(getColor());
        System.out.println(sb);
        return sb;
    }
}
