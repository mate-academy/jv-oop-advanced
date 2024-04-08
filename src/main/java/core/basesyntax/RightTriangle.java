package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append("rectangle, ")
                .append("area: ")
                .append(calculateArea())
                .append(" sq. units,")
                .append(" firstLeg: ")
                .append(firstLeg)
                .append(" units,")
                .append(" secondLeg: ")
                .append(secondLeg)
                .append(" units,")
                .append(" color: ")
                .append(getColor().name());

        System.out.println(sb);
    }
}
