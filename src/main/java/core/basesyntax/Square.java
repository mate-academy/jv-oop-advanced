package core.basesyntax;

public class Square extends Figure {
    private int firstLeg;

    public Square(int firstLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * firstLeg;
    }


    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, firstLeg: " + firstLeg + " units, color: " + getColor());
    }
}
