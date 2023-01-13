package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setArea(firstLeg * secondLeg * 0.5);
    }

    @Override
    public void draw() {
        System.out.print("Name: right triangle");
        super.draw();
        System.out.println("fist leg: " + firstLeg + " units, "
                + "second leg " + secondLeg + " units");
    }
}
