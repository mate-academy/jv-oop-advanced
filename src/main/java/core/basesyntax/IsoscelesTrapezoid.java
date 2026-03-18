package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (this.base1 + this.base2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                +
                this.getArea()
                +
                " sq. units, base1: "
                +
                this.base1
                +
                " units, base2: "
                +
                this.base2
                +
                " units, height: "
                +
                this.height
                +
                " units, color: "
                +
                this.color
        );
    }
}
