package core.basesyntax.models;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg > 0 ? firstLeg : 1;
        this.secondLeg = secondLeg > 0 ? secondLeg : 1;
        this.setColor(color);
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
