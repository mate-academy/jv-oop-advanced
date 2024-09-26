package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upbothside;
    private int downbothside;
    private int height;

    public IsoscelesTrapezoid(String color, int upbothside, int downbothside, int height) {
        super(color);
        this.upbothside = upbothside;
        this.downbothside = downbothside;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid");
        System.out.println("Color: " + getColor());
        System.out.println("Up both side length: " + upbothside);
        System.out.println("Down both side length: " + downbothside);
        System.out.println("Height length: " + height);
    }

    @Override
    public double getArea() {
        return (double) ((upbothside + downbothside) * height) / 2;
    }
}
