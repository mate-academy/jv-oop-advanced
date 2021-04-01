package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color, "rectangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String draw() {
        return super.draw() + ", first side: " + this.firstSide + ", second side: "
                + this.secondSide + " units.";
    }

    @Override
    public double calculateArea() {
        return this.firstSide * this.secondSide;
    }
}
