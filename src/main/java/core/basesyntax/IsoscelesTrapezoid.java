package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height) {
        setFigureName("isosceles trapezoid");
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getFigureArea() {
        return (double) (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getFigureArea()
                + " sq. units, upper base: " + getUpperBase()
                + " unit(s), lower base: " + getLowerBase()
                + " unit(s), height: " + getHeight()
                + " unit(s), color: " + getFigureColor());
    }
}
