package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int lenght1;
    private int lenght2;

    public IsoscelesTrapezoid(String color, int height, int alenght, int blenght) {
        super(color);
        this.height = height;
        this.lenght1 = alenght;
        this.lenght2 = blenght;
    }

    public double getArea() {
        return (lenght1 + lenght2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + " area: "
                + getArea() + "," + " height: "
                + height + "," + " a length: " + lenght1 + "," + " b lenght: "
                + lenght2 + "," + " color: " + super.getColor());
    }
}
