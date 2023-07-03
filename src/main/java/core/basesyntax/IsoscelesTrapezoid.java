package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static String defaultColor = Color.VIOLET.name();
    private static int defaultBaseLength1 = 2;
    private static int defaultBaseLength2 = 7;
    private static int defaultHeight = 3;

    private int baseLength1;
    private int baseLength2;
    private int height;

    public IsoscelesTrapezoid() {
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return height * (baseLength1 + baseLength2) * 0.5;
    }

    @Override
    void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.baseLength1 = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.baseLength2 = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.height = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    void setDefaultParameters() {
        this.color = defaultColor;
        this.baseLength1 = defaultBaseLength1;
        this.baseLength2 = defaultBaseLength2;
        this.height = defaultHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.calculateArea()
                + " sq.units, baseLength1: " + baseLength1
                + " units, baseLength2: " + baseLength2
                + " units, height: " + height
                + " units, color: " + color.toLowerCase());
    }
}
