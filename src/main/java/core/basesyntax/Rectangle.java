package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
        super.setArea(firstLeg * secondLeg);

    }

    @Override
    public void draw() {
        System.out.print("Name: rectangle");
        super.draw();
        System.out.println("fist side: " + firstSide + " units, "
                + "second side " + secondSide + " units");
    }
}
