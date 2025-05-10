package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color, double height, double firstBase, double secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2 * height);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", height: " + height
                + " units, firstBase: " + firstBase
                + " units, secondBase: " + secondBase + " units");
    }
}
