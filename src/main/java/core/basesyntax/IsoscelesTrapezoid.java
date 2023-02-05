package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private int height;
    private int longerBase;
    private int shorterBase;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLongerBase() {
        return longerBase;
    }

    public void setLongerBase(int longerBase) {
        this.longerBase = longerBase;
    }

    public int getShorterBase() {
        return shorterBase;
    }

    public void setShorterBase(int shorterBase) {
        this.shorterBase = shorterBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units, "
                + "height: " + getHeight() + " units, "
                + "longerBase: " + getLongerBase() + " units, "
                + "shortBase: " + getShorterBase() + " units, "
                + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return ((longerBase + shorterBase) * height) / 2;
    }
}
