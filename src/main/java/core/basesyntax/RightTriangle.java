package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int hypotenuse;

    public RightTriangle(Color color, int firstLeg, int secondLeg, int hypotenuse) {
        super(Shape.RIGHT_TRIANGLE, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
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

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg * 0.5;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getShape() + ", area: " + this.getArea()
                + " sq.units, leg base: " + firstLeg + " sq.units, leg height: "
                + secondLeg + " sq.units, hypotenuse: " + hypotenuse
                + " sq.units, color: " + this.getColor();
    }
}
