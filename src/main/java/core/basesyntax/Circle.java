package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder("Figure: ");
        str.append("circle").append(", ")
                .append("area: ").append(Math.PI * radius * radius).append(" sq.units, ")
                .append("radius: ").append(radius).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(str.toString());
    }
}
