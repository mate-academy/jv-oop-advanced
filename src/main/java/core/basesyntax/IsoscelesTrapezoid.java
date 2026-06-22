package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void toDraw() {
        System.out.println(getColor() + " Isosceles trapezoid:" + "\n base1: " + base1
                + "\n base2: " + base2 + "\n height: " + height + "\n area " + getArea());
    }

    @Override
    public double getArea() {
        return (double) ((base1 + base2) * height) / 2;
    }
}
