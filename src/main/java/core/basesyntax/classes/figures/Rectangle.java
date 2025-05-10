package core.basesyntax.classes.figures;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public void drawData() {
        System.out.printf("Figure: rectangle, area: %.1f sq. units, firstLeg: %d units, "
                + "secondLeg: %d units, color: %s%n", this.calculateArea(),
                this.sideA, this.sideB, super.getColor());
    }
}
