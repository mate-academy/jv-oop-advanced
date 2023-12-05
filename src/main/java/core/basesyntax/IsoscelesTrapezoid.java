package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private String color;
    private int base;
    private int height;

    public IsoscelesTrapezoid(String color, int base, int height) {
        super(color);
        this.color = color;
        this.base = base;
        this.height = height;

    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", Color: " + color
                + ", area: " + getArea());
    }
}
