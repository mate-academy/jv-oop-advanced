package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: righttriangle, area: "
                + calculateArea()
                + " sq. units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor());
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
