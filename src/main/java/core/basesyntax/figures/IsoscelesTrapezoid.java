package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int firsBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int firsBase, int secondBase, int height) {
        super(name, color);
        this.firsBase = firsBase;
        this.secondBase = secondBase;
        this.height = height;
        super.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return (firsBase + secondBase) / 2.0 * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first base: " + firsBase + " units"
                + " ,second base: " + secondBase + " units"
                + ", height: " + height + " units");
    }
}
