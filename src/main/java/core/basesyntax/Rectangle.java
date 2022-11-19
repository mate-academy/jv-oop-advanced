package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

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

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    public String drawFigure(Rectangle rectangle) {
        return "Figure: " + rectangle.getName() + ", area: " + rectangle.getArea()
                + " sq.units, first side: " + rectangle.getFirstSide()
                + " units, second side: " + rectangle.getSecondSide() + " units, color: "
                + rectangle.getColor();
    }
}
