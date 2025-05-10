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
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: Isosceles trapezoid, ").append("area: ")
                .append(getArea()).append(" sq.units, upper side: ")
                .append(upperSide).append(" units, lower side: ")
                .append(lowerSide).append(" units, lateral side: ")
                .append(lateralSide)
                .append(" units, color: ").append(getColor()));
    }
}
