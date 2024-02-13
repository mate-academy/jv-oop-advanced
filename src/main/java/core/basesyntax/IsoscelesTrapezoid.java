package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double side;

    public IsoscelesTrapezoid(String color, double base1, double base2, double side) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        if (base1 < base2) {
            double temp = base1;
            this.base1 = this.base2;
            this.base2 = temp;
        }
        this.height = height;
        this.side = side;
    }

    private double getHeight() {
        return Math.sqrt(Math.pow(base2, 2) - Math.pow((base1 - side), 2) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.area()
                + "sq. units, first side: " + this.base1 + "units, second side: "
                + this.base2 + "units, lateral side:  " + this.side + "units, color: "
                + this.color);
    }

    @Override
    public double area() {
        return (this.base1 + this.base2) * 0.5 * this.height;
    }
}
