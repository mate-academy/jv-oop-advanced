package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private int biggerBase;
    private int smallerBase;
    private int side;

    public IsoscelesTrapezoid(int biggerBase, int smallerBase, int side, Color color) {
        super(color, calculateArea(smallerBase, biggerBase, side), "Isosceles trapezoid");
        this.biggerBase = biggerBase;
        this.smallerBase = smallerBase;
        this.side = side;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, side: " + getSide() + " units, bigger base: "
                + getBiggerBase() + ", smaller base " + getSmallerBase() 
                + ", color: " + getColor());
    }

    private static double calculateArea(int biggerBase, int smallerBase, int side) {
        return (biggerBase + smallerBase) / 4.0 * Math.sqrt(4 * Math.pow(side, 2)
                - Math.pow(biggerBase - smallerBase, 2));
    }

    public int getBiggerBase() {
        return biggerBase;
    }

    public int getSmallerBase() {
        return smallerBase;
    }

    public int getSide() {
        return side;
    }
}
