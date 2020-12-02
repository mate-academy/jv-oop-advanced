package core.basesyntax;

public class RightTriangle extends Shape {

    private StringBuilder message = new StringBuilder();
    private int sideA;
    private int sideB;

    public RightTriangle(String name, FigureProducer producer) {
        super(name);
        this.sideA = producer.generatorNumber();
        this.sideB = producer.generatorNumber();
    }

    @Override
    public double calculateArea() {
        return 1 / 2 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + getHypotenuse();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Right Triangle");
    }

    @Override
    public String info() {
        return message.append(super.info()).append(",area: " + this.calculateArea() + " sq.units ")
        .append("hypotenuse: " + this.getHypotenuse() + " units ").toString();
    }

    public double getHypotenuse() {
        double result = (Math.sqrt((sideA * sideA) + (sideB * sideB)));
        return Math.round(result);
    }
}
