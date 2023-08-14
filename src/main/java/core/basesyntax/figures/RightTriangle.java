package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int hypotenuse, int firstLeg, int secondLeg) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: right triangle, area: ").append(getArea())
                .append(", hypotenuse: ").append(hypotenuse)
                .append(", firstLeg: ").append(firstLeg)
                .append(", secondLeg: ").append(secondLeg)
                .append(", color: ").append(getColor())
                .append('\n');
        System.out.println(stringBuilder.toString());
    }
}
