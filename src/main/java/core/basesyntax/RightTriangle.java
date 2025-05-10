package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(getClass().getSimpleName())
                .append(", area: ").append(getArea()).append(" sq.units, firstLeg: ")
                .append(firstLeg).append(" units,  secondLeg: ")
                .append(secondLeg).append(" units, color: ")
                .append(getColor()).toString();
        System.out.println(sb);
    }

}
