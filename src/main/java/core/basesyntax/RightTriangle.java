package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public int area() {
        return (int) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, " +
                "firstLeg: " + firstLeg + " units " +
                ", secondLeg: " + secondLeg + " units " +
                ", color: " + getColor() +
                ", area: " + area() + " sq. units";
    }
}
