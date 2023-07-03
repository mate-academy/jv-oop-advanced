package core.basesyntax;

public class RightTriangle extends Figure {
    private static String defaultColor = Color.BLUE.name();
    private static int defaultFirstLeg = 6;
    private static int defaultSecondLeg = 9;

    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.firstLeg = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.secondLeg = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    void setDefaultParameters() {
        this.color = defaultColor;
        this.firstLeg = defaultFirstLeg;
        this.secondLeg = defaultSecondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.calculateArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + color.toLowerCase());
    }
}
