package core.basesyntax;

public class Square extends Figure {
    private static Color defaultColor = Color.GREEN;
    private static int defaultSide = 10;

    private int side;

    public Square() {
        if (FigureSupplier.isDefault()) {
            setDefaultParameters();
        }
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.side = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    void setDefaultParameters() {
        this.color = defaultColor;
        this.side = defaultSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + color.name().toLowerCase());
    }
}
