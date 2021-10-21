package core.basesyntax;

public class Rectangle extends Shape {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        float valueOfArea = countArea();
        setArea(valueOfArea);
    }

    @Override
    public float countArea() {
        return (float) (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, " + "area: " + getArea() + " sq.units"
                + "  this.firstLeg: " + this.firstLeg
                + " units" + " secondLeg: " + secondLeg
                + " units" + ", color: " + getColor());
    }
}

