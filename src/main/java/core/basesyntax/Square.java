package core.basesyntax;

public class Square extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Square(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + String.format("%.2f", getArea())
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + super.getColor().toLowerCase());
    }

    @Override
    public Double getArea() {
        return (double) firstLeg * secondLeg;
    }
}
