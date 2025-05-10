package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int shorterSide;
    private int longerSide;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getShorterSide() {
        return shorterSide;
    }

    public void setShorterSide(int shorterSide) {
        this.shorterSide = shorterSide;
    }

    public int getLongerSide() {
        return longerSide;
    }

    public void setLongerSide(int longerSide) {
        this.longerSide = longerSide;
    }

    @Override
    public double getArea() {
        return (shorterSide + longerSide) * height / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, shorter side: " + shorterSide
                + " units, longer side: " + longerSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
