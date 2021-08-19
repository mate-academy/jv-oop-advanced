package core.basesyntax;

public class Rectangle extends Figure {
    private int bottomSide;
    private int leftSide;

    public Rectangle(String name, String color, int bottomSide, int leftSide) {
        super(name, color);
        this.bottomSide = bottomSide;
        this.leftSide = leftSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public int getLeftSide() {
        return leftSide;
    }

    @Override
    public double countArea() {
        return bottomSide * leftSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + countArea() + ", bottom side: "
                + bottomSide + ", top side: " + bottomSide + ", left side: "
                + leftSide + ", right side: " + leftSide);
    }
}
