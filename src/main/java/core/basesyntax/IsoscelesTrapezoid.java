package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double lowBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double lowBase, double height, String color) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.lowBase = lowBase;
    }

    @Override
    public double getArea() {
        return (double) (height / 2) * (topBase * lowBase);
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid \n" + "Area - " + getArea() + "\n"
                + "Color - " + color + "\n" + "Height - " + height + "\n"
                + "Top base - " + topBase + "\n" + "Low base - " + lowBase);
    }
}
