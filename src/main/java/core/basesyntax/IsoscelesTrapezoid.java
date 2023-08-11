package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topBase;
    private double botBase;

    public IsoscelesTrapezoid(String color, double height, double topBase, double botBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.botBase = botBase;
    }

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return ((topBase + botBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, Area: "
                + getArea() + ", BotBase: " + botBase
                + ", TopBase: " + topBase + ", Height: " + height
                + ", Color: " + getColor());
    }
}
