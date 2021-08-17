package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String figureColor, int firstSide, int secondSide) {
        super(figureColor);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double obtainArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        StringBuilder squareStringBuilder = new StringBuilder();
        String area = String.format("%.2f", obtainArea()).replace(',', '.');
        squareStringBuilder.append("Figure: rectangle, color: ").append(getFigureColor())
                .append(", firstSide: ").append(firstSide).append(" units")
                .append(", secondSide: ").append(secondSide).append(" units")
                .append(", area: ").append(area).append(" sq.units");
        System.out.println(squareStringBuilder);
    }
}
