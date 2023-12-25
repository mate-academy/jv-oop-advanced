package core.basesyntax;

public class RightTriangle extends Figure {
    private double cat1;
    private double cat2;
    private String name;

    public RightTriangle(double cat1, double cat2, String name, String color) {
        super(color);
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.name = name;
    }

    @Override
    public double calculateArea() {
        return (cat1 * cat2) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "cat1: " + getCat1()
                + ", " + "cat2: " + getCat2()
                + ", " + "color: " + getColor());
    }

    public double getCat1() {
        return cat1;
    }

    public double getCat2() {
        return cat2;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
