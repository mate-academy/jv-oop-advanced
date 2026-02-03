package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        setColor(color);
        setName(Figures.RIGHT_TRIANGLE.name());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setLegs(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append(getName())
                .append(", ")
                .append("area: ")
                .append(getArea())
                .append("sq. units, ")
                .append("firstLeg: ")
                .append(firstLeg)
                .append(" units, ")
                .append("secondLeg: ")
                .append(secondLeg)
                .append(" units, ")
                .append("color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
