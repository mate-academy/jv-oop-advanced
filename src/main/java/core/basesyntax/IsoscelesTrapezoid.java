package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int upperSide, int bottomSide, int height, String color) {
        super(color);
        this.upperSide = upperSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperSide + bottomSide) / 2 * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("IsoscelesTrapezoid. Upper side: " + upperSide
                + ". Bottom side: " + bottomSide + ". Height: "
                + height + ". Area: " + getArea() + ". Color: " + getColor());
    }

    public int getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int upperSide) {
        this.upperSide = upperSide;
    }

    public int getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
