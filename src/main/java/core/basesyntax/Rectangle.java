package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String name, int firstSide, int secondSide, String color) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + "color: " + getColor()
                + "first side: " + getFirstSide()
                + "second side: " + getSecondSide();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
