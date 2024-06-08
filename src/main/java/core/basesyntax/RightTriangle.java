package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: rightTriangle, firstLeg: "
                + firstLeg
                + ", secondLeg: "
                + secondLeg
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }
}
