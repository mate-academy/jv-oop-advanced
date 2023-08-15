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
        System.out.println(
                "Figure: right triangle, area: " + getArea()
                + ", hypotenuse: " + hypotenuse
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", color: " + getColor()
                + "\n");
    }
}
