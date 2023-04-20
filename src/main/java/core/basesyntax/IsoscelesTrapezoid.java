package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int top, bot, side;

    public IsoscelesTrapezoid(int top, int bot, int side, String color) {
        this.top = top;
        this.bot = bot;
        this.side = side;
        super.color = color;
    }

    private double getHeight() {
        return 0.5 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(top - bot, 2));
    }

    @Override
    public double getArea() {
        return getHeight() * (top + bot) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Trapezoid top side is " + top + ", bot side is " + bot + ", leg is " + side +
                " and the color is " + color);
    }
}
