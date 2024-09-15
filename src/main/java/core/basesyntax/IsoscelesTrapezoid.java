package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(
                getFigureNameMessage() + getFigureAreaMessage() + "first base: " + firstBase
                        + " units, second base " + secondBase + " units, height " + height
                        + " units, " + getFigureColorMessage());
    }
}
