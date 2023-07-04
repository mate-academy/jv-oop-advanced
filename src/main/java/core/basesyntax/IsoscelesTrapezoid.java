package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final Color DEFAULT_COLOR = Color.VIOLET;
    private static final int DEFAULT_BASE_LENGTH_1 = 2;
    private static final int DEFAULT_BASE_LENGTH_2 = 7;
    private static final int DEFAULT_HEIGHT = 3;

    private int baseLength1;
    private int baseLength2;
    private int height;

    public IsoscelesTrapezoid() {
        if (FigureSupplier.isDefault()) {
            setDefaultParameters();
        }
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return height * (baseLength1 + baseLength2) * 0.5;
    }

    @Override
    protected void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.baseLength1 = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.baseLength2 = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.height = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    protected void setDefaultParameters() {
        this.color = DEFAULT_COLOR;
        this.baseLength1 = DEFAULT_BASE_LENGTH_1;
        this.baseLength2 = DEFAULT_BASE_LENGTH_2;
        this.height = DEFAULT_HEIGHT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.calculateArea()
                + " sq.units, baseLength1: " + baseLength1
                + " units, baseLength2: " + baseLength2
                + " units, height: " + height
                + " units, color: " + color.name().toLowerCase());
    }
}
