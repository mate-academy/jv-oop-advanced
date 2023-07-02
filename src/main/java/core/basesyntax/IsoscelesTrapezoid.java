package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseTop;
    private int baseBot;
    private int high;

    public IsoscelesTrapezoid(Color color, int baseTop, int baseBot, int high) {
        super(color);
        this.baseTop = baseTop;
        this.baseBot = baseBot;
        this.high = high;
    }

    @Override
    public double getArea() {
        return (double) ((baseBot + baseTop) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top base: " + baseTop
                + " uints, bot base: " + baseBot
                + " units, high " + high
                + " units, color: " + getColor().name());
    }
}

