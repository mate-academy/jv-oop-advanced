package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getFigureArea() {
        return (double) (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first base: " + firstBase
                + ", second base: " + secondBase
                + ", height: " + height
                + ", area: " + getFigureArea()
                + ".");
    }
}
