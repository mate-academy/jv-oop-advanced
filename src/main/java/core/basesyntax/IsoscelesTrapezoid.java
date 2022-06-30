package core.basesyntax;

public class IsoscelesTrapezoid extends State {
    private int ground1;
    private int ground2;
    private int higth;

    public void setGround1(int ground1) {
        this.ground1 = ground1;
    }

    public void setGround2(int ground2) {
        this.ground2 = ground2;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }

    @Override
    public double getArea() {
        return ((ground1 + ground2) * higth) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid "
                + ", area: "
                + getArea()
                + " sq.units"
                + ", ground1: "
                + ground1
                + " units"
                + ", ground2: "
                + ground2
                + ", higth: "
                + higth
                + ", color: "
                + getColor());
    }
}
