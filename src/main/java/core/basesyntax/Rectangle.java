package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstside, int secondside) {
        super(color);
        this.firstSide = firstside;
        this.secondSide = secondside;
    }

    public int getFirstside() {
        return firstSide;
    }

    public void setFirstside(int firstside) {
        this.firstSide = firstside;
    }

    public int getSecondside() {
        return secondSide;
    }

    public void setSecondside(int secondside) {
        this.secondSide = secondside;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: " + secondSide 
                + " units, Color: " + getColor().name());
    } 
}
