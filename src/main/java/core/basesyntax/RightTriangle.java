package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setArea(firstLeg * secondLeg * 0.5);
    }

    @Override
    public void printInfoAboutFigures() {
        super.printInfoAboutFigures();
        System.out.println("fist leg: " + firstLeg + " units, "
                + "second leg " + secondLeg + " units");
    }
}
