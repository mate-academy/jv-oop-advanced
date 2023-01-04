package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
        super.setArea(firstLeg * secondLeg);

    }

    @Override
    public void print() {
        super.print();
        System.out.println("fist side: " + firstSide + " units, "
                + "second side " + secondSide + " units, " + "area: "
                + getArea() + " square units");
    }
}
