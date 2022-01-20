package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: right triangle, area: ")
                .append(getArea()).append(" sq.units, first leg: ").append(firstLeg)
                .append(" units, second leg: ").append(secondLeg).append(" units, color: ")
                .append(getColor()));
    }
}
