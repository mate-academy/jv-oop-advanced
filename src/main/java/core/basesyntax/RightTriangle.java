package core.basesyntax;

public class RightTriangle extends Figure {
    private double cat1;
    private double cat2;
    private String name;
    private String color;

    public RightTriangle() {
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

    public void setCat1(double cat1) {
        this.cat1 = cat1;
    }

    public void setCat2(double cat2) {
        this.cat2 = cat2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
