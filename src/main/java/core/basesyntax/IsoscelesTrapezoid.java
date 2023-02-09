package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int topBase;
    private int bottomBase;
    private int hight;

    public IsoscelesTrapezoid(Color color, int topBase, int bottomBase, int hight) {
        setColor(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.hight = hight;
    }

    @Override
    public double calculateArea() {
        return (double) (topBase * bottomBase) / 2 * hight;
    }

    @Override
    public void draw() {
        System.out.println("\nIsoscelesTrapezoid with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("topBase:" + topBase
                 + " \nbottomBase:" + bottomBase
                 + " \nhight:" + hight);
    }
}
