package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase,double secondBase,double height,String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((firstBase * secondBase) / 2) * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a IsoscelesTrapezoid...");
        System.out.println("firstBase: " + firstBase);
        System.out.println("secondBase: " + secondBase);
        System.out.println("height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }

}
