package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        setColor(color);
        setName(Figures.CIRCLE.name());
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append(getName())
                .append(", ")
                .append("area: ")
                .append(getArea())
                .append("sq. units, ")
                .append("radius: ")
                .append(radius)
                .append(" units, ")
                .append("color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
