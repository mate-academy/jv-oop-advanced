package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public int getBase1() {
        return base1;
    }

    public int getBase2() {
        return base2;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double findArea() {
        return (double) (base1 + base2) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + FigureName.ISOSCELESTRAPEZOID.name()
                + ", area: "
                + findArea()
                + " sq. units, color: "
                + getColor()
                + ", first base: "
                + base1
                + ", second base: "
                + base2
                + ", height: "
                + height);
    }
}
