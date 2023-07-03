package core.basesyntax;

public class Rectangle extends Figure {
    private static String defaultColor = Color.BLACK.name();
    private static int defaultLength = 5;
    private static int defaultWidth = 9;

    private int length;
    private int width;

    public Rectangle() {
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

    void setDefaultParameters() {
        this.color = defaultColor;
        this.length = defaultLength;
        this.width = defaultWidth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.calculateArea()
                + " sq.units, length: " + length
                + " units, width: " + width
                + " units, color: " + color.toLowerCase());
    }
}
