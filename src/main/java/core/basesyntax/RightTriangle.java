package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (double) this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area: " + this.getArea()
                + " sq.units, firstLeg: " + this.getFirstLeg() + " units, secondLeg: "
                + this.getSecondLeg() + " units, color: " + this.getColor());
    }
}
