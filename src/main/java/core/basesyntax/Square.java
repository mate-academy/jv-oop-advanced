package core.basesyntax;

public class Square extends Figure {
    private final double firstLeg;

    public Square(String color, double firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area : " + getArea() + " sq. units, firstLeg: "
                + firstLeg + " units, color: " + color);
    }
}
