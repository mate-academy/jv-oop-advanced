package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;
    private String color;

    public IsoscelesTrapezoid(int baseOne, int baseTwo, int height, String color) {
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    @Override
    public void draw() {
        System.out.println("Name: isoscelesTrapezoid, baseOne: " + baseOne + ", baseTwo: "
                + baseTwo + ", height:" + height + ", area: " + getFormat().format(getArea())
                + ", color: " + color);
    }
}
