package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append("rightTriangle, area: ")
                .append(getArea()).append(" sq.units, ")
                .append("firstLeg: ").append(firstLeg)
                .append(" secondLeg: ")
                .append(secondLeg)
                .append(" color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
