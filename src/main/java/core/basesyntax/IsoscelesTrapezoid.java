package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int hide) {
        super(color, "IsoscelesTrapezoid");
        this.base1 = base1;
        this.base2 = base2;
        this.height = hide;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2.0;
    }

    @Override
    public void draw() {

    }
}
