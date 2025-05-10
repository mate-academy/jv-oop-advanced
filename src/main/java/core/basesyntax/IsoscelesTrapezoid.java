package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements GetFigureArea{
    private double base1;
    private double base2;
    private double height;

    public void draw() {
        System.out.println("Figure - IsoscelesTrapezoid: base1 " + this.base1
                + ", base2 " + this.base2 + " ,height " + this.height
                + " ,area " + this.getArea() + " color "
                + this.getColor());
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }
    public IsoscelesTrapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }
}
