package core.basesyntax;

public class Rectangle extends Figure {
    private int leftRightSide;
    private int topBottomSide;

    public Rectangle(String color, int leftRightSide, int topBottomSide) {
        super(color);
        this.leftRightSide = leftRightSide;
        this.topBottomSide = topBottomSide;
    }

    public int leftRightSide() {
        return leftRightSide;
    }

    public void leftRightSide(int lrSide) {
        this.leftRightSide = lrSide;
    }

    public int topBottomSide() {
        return topBottomSide;
    }

    public void topBottomSide(int tpSide) {
        this.topBottomSide = tpSide;
    }

    @Override
    public double getArea() {
        return leftRightSide * topBottomSide;
    }

    @Override
    public String draw() {
        return "Rectangle Color: " + getColor() + " - Radius: " + getArea();
    }

}
