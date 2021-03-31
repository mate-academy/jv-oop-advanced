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
    public int getArea() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public String drawArea() {
        return super.drawArea() + ", first side: " + this.firstSide + ", second side: "
                + this.secondSide + " units.";
    }
}
