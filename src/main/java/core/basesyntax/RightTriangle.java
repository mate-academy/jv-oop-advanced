package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setType("RightTriangle");
        setColor(color);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: ")
                .append(getType())
                .append(", Area: ")
                .append(getArea())
                .append(" sq.units")
                .append(", firstLeg: ")
                .append(firstLeg)
                .append(" units")
                .append(", secondLeg: ")
                .append(secondLeg)
                .append(" units")
                .append(", color: ")
                .append(getColor()));
    }
}
