package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                            + getArea()
                            + " sq.units, firstLeg: "
                            + firstLeg
                            + " units, secondLeg: "
                            + secondLeg
                            + " units, color: "
                            + getColor());
    }
}
