package core.basesyntax;

public class Square extends Figure {
    private double oneSide;

    public double getOneSide() {
        return oneSide;
    }

    public void setOneSide(double oneSide) {
        this.oneSide = oneSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, " + "area: " + getArea() + " units, "
                + "side: " + oneSide + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return oneSide * oneSide;
    }
}
