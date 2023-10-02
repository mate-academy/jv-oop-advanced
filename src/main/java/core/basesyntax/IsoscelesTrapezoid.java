package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int alenght;
    private int blenght;

    public IsoscelesTrapezoid(String color, int height, int alenght, int blenght) {
        super(color);
        this.height = height;
        this.alenght = alenght;
        this.blenght = blenght;
    }

    @Override
    public double getArea() {
        return (alenght + blenght) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + " area: "
                + getArea() + "," + " height: "
                + height + "," + " a length: " + alenght + "," + " b lenght: "
                + blenght + "," + " color: " + super.getColor());
    }
}
