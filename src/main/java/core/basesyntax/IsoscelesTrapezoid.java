package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topLine;
    private int bottomLine;
    private int height;

    public IsoscelesTrapezoid(int topLine, int bottomLine, int height, String color) {
        this.setTopLine(topLine);
        this.setBottomLine(bottomLine);
        this.setHeight(height);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (((double)getHeight() / 2) * (topLine + bottomLine));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + IsoscelesTrapezoid.class.getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq.units, topLine: " + getTopLine()
                + " units, bottomLine: " + getBottomLine() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    public int getTopLine() {
        return topLine;
    }

    public void setTopLine(int topLine) {
        this.topLine = topLine;
    }

    public int getBottomLine() {
        return bottomLine;
    }

    public void setBottomLine(int bottomLine) {
        this.bottomLine = bottomLine;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
