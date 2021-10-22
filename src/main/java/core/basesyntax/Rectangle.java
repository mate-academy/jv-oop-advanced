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
        System.out.println("Rectangle, area: " + countArea()
                          + " sq.units firstLeg: " + firstLeg + " units, secondLeg: "
                          + secondLeg + " units, color: " + getColor());
    }
}

