package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.setFirstSide(firstSide);
        this.setSecondSide(secondSide);
        this.setColor(color);
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getAreaFigure() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getAreaFigure()
                + " sq.units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }
}
