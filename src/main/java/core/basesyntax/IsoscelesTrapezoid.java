package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private static final double DEFAULT_AREA = 0.5;
    private static final String DRAW_FORMAT = "firstBase: %.2f units, "
            + "secondBase: %.2f units, Height: %.2f units";

    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return DEFAULT_AREA * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.printf(DRAW_FORMAT + "%n", firstBase, secondBase, height);
    }
}
