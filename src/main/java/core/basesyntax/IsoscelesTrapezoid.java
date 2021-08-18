package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name;
    private String color;
    private int baseOne;
    private int baseTwo;
    private int height;

    public IsoscelesTrapezoid() {
        this.name = "Isosceles trapezoid";
        this.color = colorSupplier.getRandomColor();
        this.baseOne = (int)(Math.random() * 100);
        this.baseTwo = (int)(Math.random() * 100);
        this.height = (int)(Math.random() * 100);
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
    public String drow() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "baseOne: " + baseOne + " units, " + "baseTwo: " + baseTwo
                    + " units, " + "height: " + height + " units, " + "color: " + color;
    }
}
