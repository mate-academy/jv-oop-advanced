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
        super.setArea((firstBase + secondBase) / 2.0);
    }

    @Override
    public void draw() {
        System.out.print("Name: isosceles trapezoid");
        super.draw();
        System.out.println("side: " + side + ", " + "first base: " + firstBase + ", "
                + "second base: " + secondBase + ", " + "hight: " + hight);
    }
}
