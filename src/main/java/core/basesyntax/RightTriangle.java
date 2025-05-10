package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5f;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: Right triangle, ").append("area: ")
                .append(getArea()).append(" sq.units, first leg: ")
                .append(firstLeg).append(" units, second leg: ")
                .append(secondLeg).append(" units, color: ")
                .append(getColor()));
    }
}
