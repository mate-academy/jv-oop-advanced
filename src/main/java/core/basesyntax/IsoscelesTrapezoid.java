package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.setColor(color);
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
    public void draw() {
        System.out.println("Drawing a isoscaledtrapezoid");
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public String getFigureData() {
        return "Figure: trapezoid, area: " + getArea()
                + " sq. units, first base: " + getBase1()
                + " sq. units, second base: " + getBase2()
                + " sq. units, height: " + getHeight()
                + " units, color: " + getColor();
    }
}
