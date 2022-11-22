package core.basesyntax;

public class RightTriangle extends Shape {
    private String color;
    private float firstLeg;
    private float secondLeg;

    public RightTriangle(String color, float firstLeg, float secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public String getColor() {
        return color;
    }

    public float getFirstLeg() {
        return firstLeg;
    }

    public float getSecondLeg() {
        return secondLeg;
    }

    @Override
    public float area() {
        return getFirstLeg() * getSecondLeg() / 2;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " right triangle with first leg equals to "
                + getFirstLeg()
                + "and second leg equals to "
                + getSecondLeg()
                + " area equals "
                + area());
    }
}
