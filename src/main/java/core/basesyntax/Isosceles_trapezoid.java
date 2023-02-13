package core.basesyntax;

public class Isosceles_trapezoid extends Figure {
    private double topSide;
    private double botSide;
    private double height;

    public Isosceles_trapezoid(double topSide, double botSide, double height, String color) {
        super(color);
        this.botSide = topSide;
        this.topSide = botSide;
        this.height = height;
    }

    @Override
    public void draw() {
         System.out.println("Figure: isosceles trapezoid, area: "
                + area()
                + " sq.units, topSide: "
                + topSide + " units, botSide: "
                + botSide + " units, color: "
                + color);
    }

    @Override
    public double area() {
        return ((topSide + botSide) / 2) * height;
    }
}
