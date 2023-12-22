package core.basesyntax;

public class Square extends Figure {
    private double side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void generateRandomParameters() {
        name = "Square";
        side = random.nextDouble() * 20;
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "side: " + getSide()
                + ", " + "color: " + getColor());
    }

    public double getSide() {
        return side;
    }
}
