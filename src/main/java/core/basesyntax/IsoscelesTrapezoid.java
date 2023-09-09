package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public int getHeight() {
        return height;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return Math.min(firstBase, secondBase) * height
                + (Math.max(firstBase, secondBase) - Math.min(firstBase, secondBase))
                * height / 2;
    }

    @Override
    public int perimeter() {
        int leg = (Math.max(firstBase, secondBase) - Math.min(firstBase, secondBase)) / 2;
        return firstBase + secondBase + 2 * (int) Math.sqrt(Math.pow(leg, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", first base: " + firstBase
                + ", second base: " + secondBase
                + ", height: " + height
                + ", color: " + getColor();
    }
}
