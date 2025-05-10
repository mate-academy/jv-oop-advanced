package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String figureColor, int firstBase, int secondBase, int height) {
        super(figureColor);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void drawFigure() {
        StringBuilder squareStringBuilder = new StringBuilder();
        String area = String.format("%.2f", obtainArea()).replace(',', '.');
        squareStringBuilder.append("Figure: isosceles trapezoid, color: ").append(getFigureColor())
                .append(", firstBase: ").append(firstBase).append(" units")
                .append(", secondBase: ").append(secondBase).append(" units")
                .append(", height: ").append(height).append(" units")
                .append(", area: ").append(area).append(" sq.units");
        System.out.println(squareStringBuilder);
    }
}
