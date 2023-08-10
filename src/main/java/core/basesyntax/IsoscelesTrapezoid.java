package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topBase;
    private int botBase;

    public IsoscelesTrapezoid(String color, int height, int topBase, int botBase) {
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
