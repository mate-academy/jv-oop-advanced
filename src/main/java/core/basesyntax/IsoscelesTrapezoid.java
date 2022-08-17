package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private final int verticalSide;

    public IsoscelesTrapezoid(String color, int longSide, int shortSide, int verticalSide) {
        super(color, longSide, shortSide);
        this.verticalSide = verticalSide;
    }

    @Override
    public double area() {
        double shortSide = this.getShortSide();
        double longSide = this.getLongSide();

        return (shortSide + longSide) / 2 * Math.sqrt(Math.pow(verticalSide, 2)
                - (Math.pow((longSide - shortSide), 2) / 4));
    }

    @Override
    public StringBuilder getSizes() {
        return super.getSizes().append(", verticalSide: ").append(verticalSide).append(" units");
    }
}
