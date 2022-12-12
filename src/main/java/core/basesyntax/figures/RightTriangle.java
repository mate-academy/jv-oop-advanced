package core.basesyntax.figures;

public class RightTriangle extends Figure {

    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return firstLeg + secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle" + ", area: " + this.getArea() + " firstLeg: "
                + this.firstLeg + " secondLeg: "
                + this.secondLeg + " units, color: " + this.getColor());
    }

}
