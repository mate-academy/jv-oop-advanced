package core.basesyntax;

public class Rectangle extends Shape {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float countArea() {
        return (float) (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle, area: %.2f sq.units firstLeg: %d units,"
                        + " secondLeg: %d units, color: " + getColor() + "\n",
                        countArea(), firstLeg, secondLeg);
    }
}

