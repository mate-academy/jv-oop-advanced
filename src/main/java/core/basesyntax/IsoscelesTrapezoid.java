package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int firstBase;
    private int secondBase;
    private int hight;

    public IsoscelesTrapezoid(Color color, int side,
                              int firstBase, int secondBase, int hight) {
        super(color);
        this.side = side;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.hight = hight;
    }

    @Override
    public void draw() {
        System.out.println("Name: isosceles trapezoid" + ", color: "
                + getColor() + ", side: " + side + ", "
                + "first base: " + firstBase + ", "
                + "second base: " + secondBase + ", " + "hight: "
                + hight + ", area:" + getArea() + " square units");
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2.0;
    }
}
