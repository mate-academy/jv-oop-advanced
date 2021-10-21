package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int botbase;
    private int topbase;
    private int height;

    public IsoscelesTrapezoid(int botbase, int topbase, int height,String color) {
        super(color);
        this.botbase = botbase;
        this.topbase = topbase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (botbase + topbase) * height;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append("isosceles trapezoid, ").append("area: ")
                .append(getArea()).append(" sq.units, ").append("botbase: ").append(botbase)
                .append(" units, ").append("topbase: ").append(topbase).append(" units, ")
                .append("height: ").append(height).append(" units, ")
                .append("color: ").append(getColor());
        return builder.toString();
    }

    @Override
    public String toString() {
        return draw();
    }
}
