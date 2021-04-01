package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color, String name) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getHypotenuse() {
        return Math.sqrt(this.firstLeg * this.firstLeg
                + this.secondLeg * this.secondLeg);
    }

    @Override
    public double getArea() {
        return (this.firstLeg * this.secondLeg) / (double) 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, hypotenuse: " + getHypotenuse()
                + " units, color: " + getColor());
    }
}
