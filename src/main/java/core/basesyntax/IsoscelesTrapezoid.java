package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private int lateralSide;

    public IsoscelesTrapezoid(int upperSide, int lowerSide, int lateralSide, String color) {
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.lateralSide = lateralSide;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((upperSide + lowerSide) / 2)
                * Math.sqrt(Math.pow(lateralSide, 2)
                        - (Math.pow(lowerSide - upperSide, 2) / 4));
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Figure: Isosceles trapezoid, ").append("area: ")
                .append(Double.valueOf(getArea()).toString()).append(" sq.units, upper side: ")
                .append(Integer.valueOf(upperSide).toString()).append(" units, lower side: ")
                .append(Integer.valueOf(lowerSide).toString()).append(" units, lateral side: ")
                .append(Integer.valueOf(lateralSide).toString())
                .append(" units, color: ").append(getColor()).toString();
    }
}
