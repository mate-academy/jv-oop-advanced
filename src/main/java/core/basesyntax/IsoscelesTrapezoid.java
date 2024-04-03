package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Base1: " + base1
                + " units, Base2: " + base2
                + " units, Height: " + height
                + " units");
    }
}
