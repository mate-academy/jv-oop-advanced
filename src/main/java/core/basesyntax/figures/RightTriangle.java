package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getFigureArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first leg: " + firstLeg
                + ", second leg: " + secondLeg
                + ", area: " + getFigureArea()
                + ".");
    }
}
