package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public int getPerimeter() {
        return firstLeg + secondLeg + (int) Math.sqrt(Math.pow(firstLeg, 2)
                + Math.pow(secondLeg, 2));
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first leg: " + firstLeg
                + ", second leg: " + secondLeg);
    }
}
