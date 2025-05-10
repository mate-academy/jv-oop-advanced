package core.basesyntax;

public class Circle extends Figure {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;

    private int radius;

    public Circle() {
        if (FigureSupplier.isDefault()) {
            setDefaultParameters();
        } else {
            setRandomParameters();
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected void setRandomParameters() {
        this.radius = random.nextInt(MAX_PARAMETER_SIZE) + 1;
    }

    @Override
    protected void setDefaultParameters() {
        this.color = DEFAULT_COLOR;
        this.radius = DEFAULT_RADIUS;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", this.calculateArea())
                + " sq.units, radius: " + radius
                + " units, color: " + color.name().toLowerCase());
    }
}
