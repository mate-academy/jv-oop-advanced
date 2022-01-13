package core.basesyntax.entities;

public class RightTriangle extends Figure {
    private static final Integer COEFFICIENT_TWO = 2;
    private Integer firstLeg;
    private Integer secondLeg;
    private Integer hypotenuse;

    public RightTriangle() {
    }

    public RightTriangle(Color color, Integer firstLeg, Integer secondLeg, Integer hypotenuse) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }

    public Integer getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(Integer firstLeg) {
        this.firstLeg = firstLeg;
    }

    public Integer getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(Integer secondLeg) {
        this.secondLeg = secondLeg;
    }

    public Integer getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(Integer hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / COEFFICIENT_TWO;
    }

    @Override
    public double getPerimeter() {
        return firstLeg + secondLeg + hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", hypotenuse:" + hypotenuse
                + ", color: " + getColor());
    }

    @Override
    public Figure clone() {
        return new RightTriangle(getColor(), firstLeg, secondLeg, hypotenuse);
    }
}
