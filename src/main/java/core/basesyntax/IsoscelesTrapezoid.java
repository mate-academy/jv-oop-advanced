package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bot;
    private int side;

    public IsoscelesTrapezoid(int top, int bot, int side, String color) {
        super(color);
        this.top = top;
        this.bot = bot;
        this.side = side;
    }

    @Override
    public double getArea() {
        return getHeight() * (top + bot) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, top side: " + top + ", bot side: " + bot + ", leg: "
                + side + ", area: " + this.getArea() + ", color: " + getColor());
    }

    private double getHeight() {
        return 0.5 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(top - bot, 2));
    }
}
