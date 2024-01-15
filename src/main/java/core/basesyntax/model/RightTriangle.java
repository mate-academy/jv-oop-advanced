package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(System.lineSeparator()).append(
                "This is a RIGHT TRIANGLE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("firstLeg = ").append(firstLeg)
                .append(System.lineSeparator()).append("secondLeg = ").append(secondLeg)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
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
}
