package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
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
