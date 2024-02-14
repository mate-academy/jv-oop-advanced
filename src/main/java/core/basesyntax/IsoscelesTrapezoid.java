package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int firstLeg, int secondLeg, int height) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    double calculateArea() {
        return ((firstLeg + secondLeg) / 2.0) * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", height" + height + " units");
    }
}
