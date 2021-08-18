package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;

    public IsoscelesTrapezoid(String name, String color) {
        super(name, color);
        this.baseOne = (int)(Math.random() * 100);
        this.baseTwo = (int)(Math.random() * 100);
        this.height = (int)(Math.random() * 100);
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) * height / 2.0;
    }

    @Override
    public String drow() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "baseOne: " + baseOne + " units, " + "baseTwo: " + baseTwo
                    + " units, " + "height: " + height + " units, " + "color: " + getColor();
    }
}
