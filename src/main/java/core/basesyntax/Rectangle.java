package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Name: rectangle" + ", color: " + getColor()
                + ", fist side: " + firstSide + " units, "
                + "second side " + secondSide + " units"
                + ", area: " + getArea() + " square units");
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
