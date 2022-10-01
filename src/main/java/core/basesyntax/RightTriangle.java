package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private int rightTriangleArea;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        getArea();
        draw();
    }

    @Override
    public double getArea() {
        rightTriangleArea = (firstLeg * secondLeg) / 2;
        return rightTriangleArea;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle; color: " + color
                + "; first leg: " + firstLeg
                + "; second leg: " + secondLeg
                + "; area: " + rightTriangleArea);
    }
}
