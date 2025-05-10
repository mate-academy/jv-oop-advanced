package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int thirdLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg, int thirdLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
        this.area = calculateArea(firstLeg, secondLeg, thirdLeg);
    }

    private int calculateArea(int firstLeg, int secondLeg, int thirdLeg) {
        int halfPerimeter = (firstLeg + secondLeg + thirdLeg) / 2;
        int x = halfPerimeter
                * (halfPerimeter - firstLeg)
                * (halfPerimeter - secondLeg)
                * (halfPerimeter - thirdLeg);
        return (int) Math.sqrt(x);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + area
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, thirdLeg: " + thirdLeg
                + " units, color: " + color);
    }
}
