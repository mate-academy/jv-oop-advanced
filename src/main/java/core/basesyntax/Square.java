package core.basesyntax;

public class Square extends Figure {

    private int bottomSide;
    private int topSide;
    private int leftSide;
    private int rightSide;

    public Square(String name, String color, int bottomSide, int topSide,
                  int leftSide, int rightSide) {
        super(name, color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    @Override
    public double countArea() {
        double area = bottomSide * bottomSide;
        return area;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + countArea()
                + ", side: " + bottomSide);
    }
}
