package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append("circle, ")
                .append("area: ")
                .append(calculateArea())
                .append(" sq. units,")
                .append(" radius: ")
                .append(radius)
                .append(" units,")
                .append(" color: ")
                .append(getColor());

        System.out.println(sb);
    }
}
