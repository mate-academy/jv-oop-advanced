package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String NAME = "isoscelesTrapezoid";
    private int heigth;
    private int smallWidth;
    private int bigWidth;

    public IsoscelesTrapezoid(int heigth, int smallWidth, int bigWidth, String color) {
        super(color);
        this.heigth = heigth;
        this.smallWidth = smallWidth;
        this.bigWidth = bigWidth;
    }

    @Override
    public double getArea() {
        return heigth / 2 * (smallWidth + bigWidth);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + getArea() + " sq.units, side: "
                + smallWidth + " units," + " side: " + bigWidth + " units,"
                + " heigth: " + heigth + " units, " + "color: " + color);
    }
}
