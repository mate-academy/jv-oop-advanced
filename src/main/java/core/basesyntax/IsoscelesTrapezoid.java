package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1 = 0;
    private double base2 = 0;
    private double height = 0;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super.setName("Isosceles Trapezoid");
        super.setColor(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, base1 : " + base1 + " base2 : " + base2 + " height : "
                + height + " units, color : " + getColor());
    }
}
