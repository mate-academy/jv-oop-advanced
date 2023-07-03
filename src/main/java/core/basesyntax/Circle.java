package core.basesyntax;

public class Circle extends Figure {
    private static String defaultColor = Color.WHITE.name();
    private static int defaultRadius = 10;

    private int radius;

    public Circle() {
        setRandomParameters();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void setRandomParameters() {
        this.color = colorSupplier.getRandomColor();
        this.radius = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    void setDefaultParameters() {
        this.color = defaultColor;
        this.radius = defaultRadius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", this.calculateArea())
                + " sq.units, radius: " + radius
                + " units, color: " + color.toLowerCase());
    }
}
