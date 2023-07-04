package core.basesyntax;

public class Rectangle extends Figure {
    private static final Color DEFAULT_COLOR = Color.BLACK;
    private static final int DEFAULT_LENGTH = 5;
    private static final int DEFAULT_WIDTH = 9;

    private int length;
    private int width;

    public Rectangle() {
        if (FigureSupplier.isDefault()) {
            setDefaultParameters();
        }
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.length = random.nextInt(MAX_PARAMETER_SIZE) + 1;
        this.width = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    void setDefaultParameters() {
        this.color = DEFAULT_COLOR;
        this.length = DEFAULT_LENGTH;
        this.width = DEFAULT_WIDTH;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.calculateArea()
                + " sq.units, length: " + length
                + " units, width: " + width
                + " units, color: " + color.name().toLowerCase());
    }
}
