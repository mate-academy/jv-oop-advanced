package core.basesyntax;

public class RightTriangle extends Figure {
    private String firstLeg;
    private String secondLeg;

    public RightTriangle(String color, String firstLeg, String secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, "
                + "color: " + super.getColor()
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg);
    }
}
