package core.basesyntax;

public class Rectangle extends Figure implements Drowable {
    private int upperSide;
    private int lowerSide;

    public Rectangle(Color color, int upperSide, int lowerSide) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
    }

    @Override
    public void drow() {
        System.out.println("Name: " + getClass().getSimpleName()
                + " Color: " + this.getColor()
                + " UpperSide: " + upperSide + " units."
                + " LowerSide: " + lowerSide + " units."
                + " Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return lowerSide * upperSide;
    }
}
