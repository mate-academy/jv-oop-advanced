package core.basesyntax;

public class Square extends Figure implements Behavior {
    private int leg;

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }
}
