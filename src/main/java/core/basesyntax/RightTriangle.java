package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder("Figure: ");
        str.append("right triangle").append(", ")
                .append("area: ").append(firstLeg * secondLeg / 2).append(" sq.units, ")
                .append("firstLeg: ").append(firstLeg).append(" units, ")
                .append("secondLeg: ").append(secondLeg).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(str.toString());
    }
}
