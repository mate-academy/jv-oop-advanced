package core.basesyntax;

public class Square extends Shape {

    private StringBuilder message = new StringBuilder();
    private int sideA;

    public Square(String name, FigureProducer producer) {
        super(name);
        this.sideA = producer.generatorNumber();
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    @Override
    public double perimeter() {
        return sideA * 4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    public String info() {
        return message.append(super.info()).append(",area: " + this.calculateArea() + " sq.units ")
        .append("side length: " + this.sideLength() + " units ").toString();

    }

    public double sideLength() {
        return perimeter() / 4;
    }
}
