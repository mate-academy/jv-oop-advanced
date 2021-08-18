package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Behavior{
    private int firstLeg;
    private int secondLeg;
    private int height;

    public void setParameter(int firstLeg, int secondLeg, int height) {
        this.height = height;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * ((firstLeg + secondLeg) / 2);
    }
}