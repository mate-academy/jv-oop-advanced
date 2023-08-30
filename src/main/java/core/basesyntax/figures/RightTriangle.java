package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return secondLeg * firstLeg / 2.0;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("firs leg: " + firstLeg + " units"
                + ", second leg: " + secondLeg);
    }
}
