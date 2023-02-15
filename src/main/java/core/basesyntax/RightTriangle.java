package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public float getArea() {
        return (float)(0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        String output = ", area: " + getArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units";
        super.draw();
        System.out.println(output);
    }
}

