package core.basesyntax;

public class Square extends Shape {

    private StringBuilder message = new StringBuilder();
    private int sideA;

    public Square(String name, FigureProducer producer, ColorProducer colorProducer) {
        super(name,colorProducer);
        this.sideA = producer.generateRandomNumber();
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    public String displayInfo() {
        return message.append(super.displayInfo())
        .append(",area: " + this.calculateArea() + " sq.units ")
        .append("side length: " + this.getSideLength() + " units ").toString();

    }

    public double getSideLength() {
        return getPerimeter() / 4;
    }
}
