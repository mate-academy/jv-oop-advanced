package core.basesyntax;

public class Rectangle extends Figure {
    private int leftSide;
    private int rightSide;

    public Rectangle(String color, int leftSide, int rightSide) {
        super(color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    @Override
    public double getArea() {
        return leftSide * rightSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, leftSide: "
                + leftSide + " units, rightSide: " + rightSide + " units, color: " + getColor();
    }
}
