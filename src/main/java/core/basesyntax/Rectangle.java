package core.basesyntax;

public class Rectangle extends AbstractFigure {

    private int firstLeg;
    private int secondLeg;

    public Rectangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: " + (firstLeg * secondLeg)
                + " sq. units, sides: " + firstLeg + " units, " + secondLeg
                + " units, color: " + color);
    }
}

