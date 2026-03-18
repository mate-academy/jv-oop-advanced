package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                +
                this.getArea()
                +
                " sq. units, firstLeg: "
                +
                this.firstLeg
                +
                " units, secondLeg: "
                +
                this.secondLeg
                +
                " units, color: "
                +
                this.color
        );
    }
}
