package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int bottomSide;
    private int topSide;
    private int leftSide;
    private int rightSide;

    public IsoscelesTrapezoid(String name, String color, int bottomSide, int topSide,
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
        int difference = (topSide - bottomSide) / 2;
        difference = (difference < 0) ? difference * (-1) : difference;
        double height = Math.sqrt((difference * difference) + (leftSide * leftSide));
        double area = (bottomSide + topSide) / 2 * height;
        return area;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + countArea() + ", bottom side: "
                + bottomSide + ", top side: " + topSide + ", left side: "
                + leftSide + ", right side: " + rightSide);
    }
}
