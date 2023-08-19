package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firsBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String name,
                              String color,
                              double firsBase,
                              double secondBase,
                              double height) {
        super(name, color);
        this.firsBase = firsBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firsBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("---------------------------------");
        System.out.println("name: " + getName());
        System.out.println("color: " + getColor());
        System.out.println("area: " + getArea());
        System.out.println("firstBase: " + firsBase);
        System.out.println("secondBase: " + secondBase);
        System.out.println("height: " + height);
    }
}
