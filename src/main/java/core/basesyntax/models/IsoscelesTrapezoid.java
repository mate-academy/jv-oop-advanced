package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (topSide + bottomSide) * height / 2;
    }

    @Override
    public String draw() {
        StringBuilder info = new StringBuilder();
        info.append("isosceles trapezoid, area: ").append(getArea())
                .append(" sq.units, top side: ").append(topSide)
                .append(" units, bottom side: ").append(bottomSide)
                .append(" units, height: ").append(height)
                .append(" units, color: ").append(getColor());
        return info.toString();
    }
}
