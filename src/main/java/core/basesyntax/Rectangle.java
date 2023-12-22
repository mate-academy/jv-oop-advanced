package core.basesyntax;

public class Rectangle extends Figure {

    private double sideA;

    private double sideB;

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public void generateRandomParameters() {
        sideA = random.nextDouble() * 20;
        sideB = random.nextDouble() * 20;
        name = "Rectangle";
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "sideA: " + getSideA()
                + ", " + "sideB: " + getSideB()
                + ", " + "color: " + getColor());
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
