package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    @Override
    public double countArea() {
        return firstSide * secondSide;
    }

    public void draw(Figure figure) {
        System.out.println("Figure: rectangle, " + "area: " + figure.countArea()
                + " sq.units, " + "first side: " + firstSide + " units,"
                + " second side " + secondSide + " units,"
                + " color: " + figure.getColor());
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }
}
