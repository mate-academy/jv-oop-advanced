package core.basesyntax;

public class RightTriangle extends Figure {
    private String color;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle has " + color
                + "color. First leg is " + firstLeg
                + " and second leg is " + secondLeg
                + ". Area is " + getArea());
    }

    @Override
    public int getArea() {
        return firstLeg * secondLeg / 2;
    }
}
