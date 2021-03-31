package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(String figureProperty, String color, int base1,
                              int base2, int height) {
        super(figureProperty, color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureProperty() + ", area: "
                + getArea() + " square units, base1: " + getBase1()
                + " units, base2: " + getBase2() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2.0;
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

}
