package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1 = 0;
    private double base2 = 0;
    private double height = 0;

    public IsoscelesTrapezoid(String color) {
        setName("Isosceles Trapezoid");
        setColor(color);
        this.base1 = getRandomSize();
        this.base2 = getRandomSize();
        this.height = getRandomSize();
    }

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        setName("Isosceles Trapezoid");
        setColor(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, base1 : " + base1 + " base2 : " + base2 + " height : "
                + height + " units, color : " + getColor());
    }
}
