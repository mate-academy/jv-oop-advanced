package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int hypotenuse;

    public RightTriangle(int firstLeg, int secondLeg, int hypotenuse, String color) {
        super(color);
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
        System.out.println("Figure: right triangle. Color: " + getColor()
                + ". Area: " + calculateArea() + ". First leg: " + firstLeg
                + ". Second leg: " + secondLeg + ". Hypotenuse: " + hypotenuse + '.');
    }

    @Override
    double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
