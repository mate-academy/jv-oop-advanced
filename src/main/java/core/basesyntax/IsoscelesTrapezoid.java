package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: color = " + getColor() + ", base1 = " + base1 + ", base2 = " + base2 + ", height = " + height);
    }
}
