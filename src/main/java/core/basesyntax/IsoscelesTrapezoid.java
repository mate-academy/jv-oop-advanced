package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallel;
    private int secondParallel;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallel, int secondParallel, int height) {
        super.setColor(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    public int getFirstParallel() {
        return firstParallel;
    }

    public void setFirstParallel(int firstParallel) {
        this.firstParallel = firstParallel;
    }

    public int getSecondParallel() {
        return secondParallel;
    }

    public void setSecondParallel(int secondParallel) {
        this.secondParallel = secondParallel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (firstParallel * secondParallel) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstParallel: " + firstParallel + " units, "
                + "secondParallel: " + secondParallel + " units, "
                + "height: " + height + " units, "
                + "color: " + super.getColor();
    }
}
