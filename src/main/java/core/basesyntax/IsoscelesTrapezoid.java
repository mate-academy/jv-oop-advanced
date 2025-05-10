package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, ColorType color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, Base1 - " + firstBase + ", Base2 - "
                + secondBase + ", Area - " + getArea() + ", Color : " + getColor().toLowerCase());
    }
}
