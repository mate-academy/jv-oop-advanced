package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public void area() {
        double areaRightTriangle = firstLeg * secondLeg / 2;
        System.out.println("The area of the right triangle is " +
                areaRightTriangle + " and colo " + getColor());
    }
}
