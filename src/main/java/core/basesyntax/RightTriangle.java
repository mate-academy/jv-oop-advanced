package core.basesyntax;

public class RightTriangle extends Figure implements Areacount,Figuredrawing {
    private int base;
    private int height;

    public RightTriangle(int base, int height,String color) {
        this.base = base;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append("right triangle, ").append("area: ").append(getArea())
                .append(" sq.units, ").append("base: ").append(base).append(" units, ")
                .append("height: ").append(height).append(" units, ")
                .append("color: ").append(getColor());
        return builder.toString();
    }

    @Override
    public String toString() {
        return draw();
    }
}
