package core.basesyntax;

public class Rectangle extends Shape implements AreaCounter {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super("Rectangle",color);
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
    public String toString() {
        return "Rectangle, " + "area: " + getArea() + " sq.units" + "  this.firstLeg: " +  this.firstLeg
                + " units" + " secondLeg: " + secondLeg + " units" + ", color: " + getColor();
    }
}

