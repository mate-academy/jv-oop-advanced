package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstGround;
    private int secondGround;
    private int higth;

    public void setFirstGround(int firstGround) {
        this.firstGround = firstGround;
    }

    public void setSecondGround(int secondGround) {
        this.secondGround = secondGround;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }

    @Override
    public double getArea() {
        return ((firstGround + secondGround) * higth) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid "
                + ", area: "
                + getArea()
                + " sq.units"
                + ", firstGround: "
                + firstGround
                + " units"
                + ", secondGround: "
                + secondGround
                + ", higth: "
                + higth
                + ", color: "
                + getColor());
    }
}
