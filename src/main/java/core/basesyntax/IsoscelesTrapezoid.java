package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {

    private StringBuilder message = new StringBuilder();
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String name, FigureProducer producer, ColorProducer colorProducer) {
        super(name, colorProducer);
        this.sideA = producer.generateRandomNumber();
        this.sideB = producer.generateRandomNumber();
        this.sideC = producer.generateRandomNumber();
    }

    @Override
    public double calculateArea() {
        return this.getAverageLine() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * sideC + sideA + sideB;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Isosceles Trapezoid");
    }

    @Override
    public String displayInfo() {
        return message.append(super.displayInfo())
        .append(",area: " + this.calculateArea() + " sq.units ")
        .append("height: " + this.getHeight() + " units ").toString();
    }

    public double getAverageLine() {
        return (sideB + sideA) / 2;
    }

    public double getHeight() {
        return Math.sqrt((sideC * sideC) - 1 / 4 * ((sideB * sideB) - (sideA * sideA)));
    }
}
