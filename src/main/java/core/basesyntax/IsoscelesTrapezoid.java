package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;

    public IsoscelesTrapezoid(String color, int baseOne, int baseTwo, int height) {
        super.setColor(color);
        super.setName("isosceles trapezoid");
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    public int getBaseOne() {
        return baseOne;
    }

    public void setBaseOne(int baseOne) {
        this.baseOne = baseOne;
    }

    public int getBaseTwo() {
        return baseTwo;
    }

    public void setBaseTwo(int baseTwo) {
        this.baseTwo = baseTwo;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) * height / 2.0;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "baseOne: " + baseOne + " units, " + "baseTwo: " + baseTwo
                    + " units, " + "height: " + height + " units, " + "color: " + getColor());
    }
}
