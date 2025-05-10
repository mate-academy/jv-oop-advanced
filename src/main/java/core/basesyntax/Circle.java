package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder();
        System.out.println(str
                .append("Figure: circle, area: ")
                .append(getArea())
                .append("sq. units, radius: ")
                .append(radius)
                .append("units, color: ")
                .append(color));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
