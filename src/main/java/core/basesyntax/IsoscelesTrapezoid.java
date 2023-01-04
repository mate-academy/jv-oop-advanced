package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int firstBase;
    private int secondBase;
    private int hight;

    public IsoscelesTrapezoid(String name, String color, int side,
                              int firstBase, int secondBase, int hight) {
        super(name, color);
        this.side = side;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.hight = hight;
        super.setArea((firstBase + secondBase) / 2.0);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("side: " + side + ", " + "first base: " + firstBase + ", "
                + "second base: " + secondBase + ", " + "hight: " + hight + "units, "
                + "area: " + getArea() + " square units");
    }
}
