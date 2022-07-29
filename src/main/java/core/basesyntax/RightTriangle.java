package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String figureColor, int firstLeg, int secondLeg) {
        super(figureColor);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double obtainArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void drawFigure() {
        StringBuilder squareStringBuilder = new StringBuilder();
        String area = String.format("%.2f", obtainArea()).replace(',', '.');
        squareStringBuilder.append("Figure: right triangle, color: ").append(getFigureColor())
                .append(", firstLeg: ").append(firstLeg).append(" units")
                .append(", secondLeg: ").append(secondLeg).append(" units")
                .append(", area: ").append(area).append(" sq.units");
        System.out.println(squareStringBuilder);
    }
}
