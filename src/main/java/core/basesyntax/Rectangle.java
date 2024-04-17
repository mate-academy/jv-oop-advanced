package core.basesyntax;

public class Rectangle implements Figure{
    private int height;
    private int said;

    public Rectangle(int height, int said) {
        this.height = height;
        this.said = said;
    }

    @Override
    public double getArea() {
        return 0.5 * (height * said);
    }

    @Override
    public String getPrint() {
        return null;
    }
}
