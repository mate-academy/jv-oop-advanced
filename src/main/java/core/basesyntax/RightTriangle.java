package core.basesyntax;

public class RightTriangle extends Figure {
    private double cat1;
    private double cat2;

    @Override
    public double calculateArea() {
        return (cat1 * cat2) / 2;
    }

    @Override
    public void generateRandomParameters() {
        cat1 = random.nextDouble() * 20;
        cat2 = random.nextDouble() * 20;
        name = "RightTriangle";
        color = colorSupplier.getRandomColor();
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
}
