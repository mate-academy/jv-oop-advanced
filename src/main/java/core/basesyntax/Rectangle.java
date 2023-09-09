package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public int area() {
        return firstSide * secondSide;
    }

    @Override
    public int perimeter() {
        return firstSide * 2 + secondSide * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", first side: " + firstSide
                + ", second side: " + secondSide
                + ", color: " + getColor();
    }
}
