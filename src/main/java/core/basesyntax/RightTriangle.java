package core.basesyntax;

public class RightTriangle extends Figure {
    private static final Color DEFAULT_COLOR = Color.BLUE;
    private static final int DEFAULT_FIRST_LEG = 6;
    private static final int DEFAULT_SECOND_LEG = 9;

    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        if (FigureSupplier.isDefault()) {
            setDefaultParameters();
        }
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    protected void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.firstLeg = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.secondLeg = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    protected void setDefaultParameters() {
        this.color = DEFAULT_COLOR;
        this.firstLeg = DEFAULT_FIRST_LEG;
        this.secondLeg = DEFAULT_SECOND_LEG;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.calculateArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + color.name().toLowerCase());
    }
}
