package core.basesyntax;

public class IsoscelesTrapezoid extends RandomFigure {
    private double topBase;
    private double lowBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double lowBase, double height, String color) {
        super(color);
        this.color = color;
        this.height = height;
        this.topBase = topBase;
        this.lowBase = lowBase;
    }

    @Override
    public double getArea() {
        return (topBase * lowBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Loading a Isosceles trapezoid \n" + "Area - " + getArea() + "\n"
                + "Color - " + color + "\n" + "Height - " + height + "\n"
                + "Top base - " + topBase + "\n" + "Low base - " + lowBase);
    }
}
