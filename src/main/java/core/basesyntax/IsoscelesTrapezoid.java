package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name = "Isosceles trapezoid";
    private String color = colorSupplier.getRandomColor();
    private int baseOne = (int)(Math.random() * 100);
    private int baseTwo = (int)(Math.random() * 100);
    private int height = (int)(Math.random() * 100);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "baseOne: " + baseOne + " units, " + "baseTwo: " + baseTwo
                    + " units, " + "height: " + height + " units, " + "color: " + color);
    }
}
