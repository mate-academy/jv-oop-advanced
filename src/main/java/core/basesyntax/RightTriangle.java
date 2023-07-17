package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: RightTriangle, color: ");

        String text = stringBuilder
                .append(super.getColor())
                .append(", firstLeg: ")
                .append(firstLeg)
                .append(", secondLeg: ")
                .append(secondLeg)
                .append(", area: ")
                .append(getArea())
                .toString();

        System.out.println(text);
    }

    @Override
    public double getArea() {
        return (Math.pow(firstLeg, 2) * Math.sqrt(3.0)) / 4;
    }
}
