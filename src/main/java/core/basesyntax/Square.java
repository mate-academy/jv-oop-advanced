package core.basesyntax;

public class Square extends Figure {
    private static final Color DEFAULT_COLOR = Color.GREEN;
    private static final int DEFAULT_SIDE = 10;

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
    protected void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.side = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    protected void setDefaultParameters() {
        this.color = DEFAULT_COLOR;
        this.side = DEFAULT_SIDE;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.calculateArea()
                + " sq.units, side: " + side
                + " units, color: " + color.name().toLowerCase());
    }
}
