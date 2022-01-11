package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements Behaviour {
    private int topLength;
    private int baseLength;
    private int height;

    public int getBaseLength() {
        return baseLength;
    }

    public int getTopLength() {
        return topLength;
    }

    public void setTopLength(int topLength) {
        this.topLength = topLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topLength + baseLength) / 2 * height;
    }

    public void setBaseLength(int baseLength) {
        this.baseLength = baseLength;
    }
}
