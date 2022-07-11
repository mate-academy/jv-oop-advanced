package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstSide, int secondSide) {
        super("right triangle", color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
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

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " square: " + getSquare() + " first side: "
                + getFirstSide() + " second side: " + getSecondSide() + " color: " + getColor());
    }

    @Override
    double getSquare() {
        return 0.5 * getFirstSide() * getSecondSide();
    }
}
