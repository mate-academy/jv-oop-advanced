package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color, String name) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setName(name);
        super.setColor(color);

    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName()
                + ", area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + ", secondLeg: " + getSecondLeg()
                + ", color: " + getColor());
    }
}
