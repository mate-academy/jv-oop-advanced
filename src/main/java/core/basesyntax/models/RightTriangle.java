package core.basesyntax.models;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        StringBuilder info = new StringBuilder();
        info.append("right triangle, area: ").append(getArea())
                .append(" sq.units, first leg: ").append(firstLeg)
                .append(" units, second leg: ").append(secondLeg)
                .append(" units, color: ").append(getColor());
        return info.toString();
    }
}
