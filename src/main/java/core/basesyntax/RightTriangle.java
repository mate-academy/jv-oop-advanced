package core.basesyntax;

public class RightTriangle extends Figure {
    private int leftLeg;
    private int rightLeg;

    public RightTriangle(String name, int leftLeg, int rightLeg, String color) {
        super(name, color);
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        setName("RightTriangle");
    }

    @Override
    public int area() {
        return (leftLeg + rightLeg) / 2;
    }

    @Override
    public String giveAllTheInformation() {
        return "Figure: " + getName() + "area: " + area() + "sq.units, " + "leftLeg: " + leftLeg
                + " units" + " rightLeg: " + rightLeg + " units" + " color: " + getColor();
    }
}
