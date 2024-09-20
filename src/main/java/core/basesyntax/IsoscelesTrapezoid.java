package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double side;
    private double height;

    public IsoscelesTrapezoid(
            Color color,
            double firstBase,
            double secondBase,
            double side,
            double height
    ) {
        super(color, ((firstBase + secondBase) * height) / 2);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %f, "
                        + "firstBase: %f, secondBase: %f, height: %f, side: %f, color: %s\n",
                area,
                firstBase,
                secondBase,
                height,
                side,
                color
        );
    }
}
