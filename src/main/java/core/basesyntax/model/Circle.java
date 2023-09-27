package core.basesyntax.model;

public class Circle extends Figure {

    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, TWO));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" circle").append(COMMA)
                .append(" area: ").append(getArea()).append(WORD_SEPARATOR)
                .append("sq.units").append(COMMA)
                .append(" radius: ").append(radius).append(WORD_SEPARATOR)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
