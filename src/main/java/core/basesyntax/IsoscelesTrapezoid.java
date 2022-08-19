package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private int verticalSide;

    public IsoscelesTrapezoid(String color, int longSide, int shortSide, int verticalSide) {
        super(color, longSide, shortSide);
        this.verticalSide = verticalSide;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder("Figure: isosceles trapezoid, ")
                        .append("area: ")
                        .append(String.format("%.1f", getArea()))
                        .append(" sq.units, shortSide: ")
                        .append(getShortSide())
                        .append(" units, longSide: ")
                        .append(getLongSide())
                        .append(" units, verticalSide: ")
                        .append(verticalSide)
                        .append(" units, color: ")
                        .append(getColor().toLowerCase())
        );
    }

    @Override
    public double getArea() {
        double shortSide = this.getShortSide();
        double longSide = this.getLongSide();
        return (shortSide + longSide) / 2 * Math.sqrt(Math.pow(verticalSide, 2)
                - (Math.pow((longSide - shortSide), 2) / 4));
    }
}
