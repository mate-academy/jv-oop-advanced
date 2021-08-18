package core.basesyntax;

public class IsoscelesTrapezoid {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setParameter(int firstLeg, int secondLeg, int height) {
        this.height = height;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
}