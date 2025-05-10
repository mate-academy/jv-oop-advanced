package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: right triangle, ")
                .append("area: ")
                .append(getArea())
                .append(" sq.units, ")
                .append("firstLeg: ")
                .append(firstLeg)
                .append(" units, ")
                .append("secondLeg: ")
                .append(secondLeg)
                .append(" units, ")
                .append("color: ")
                .append(getColor().name().toLowerCase());
        String stringToPrint = stringBuilder.toString();

        System.out.println(stringToPrint);
    }
}
