package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double longerBase;
    private double shorterBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double longerBase, double shorterBase, double height) {
        super(color);
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((longerBase + shorterBase) * height) / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(String.format("Longer base: %s. Shorter base: %s. Height: %s",
                longerBase, shorterBase, height));
    }
}
