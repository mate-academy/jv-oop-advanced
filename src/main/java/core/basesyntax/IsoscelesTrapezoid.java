package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heigth;
    private int firstWidth;
    private int secondWidth;

    public IsoscelesTrapezoid(int heigth, int firstWidth, int secondWidth, String color) {
        super(color);
        this.heigth = heigth;
        this.firstWidth = firstWidth;
        this.secondWidth = secondWidth;
    }

    @Override
    public double getArea() {
        return heigth / 2 * (firstWidth + secondWidth);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, side: " + firstWidth + " units," + " side: " + secondWidth
                + " units," + " heigth: " + heigth + " units, " + "color: " + color);
    }
}
