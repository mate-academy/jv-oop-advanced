package core.basesyntax;

public class Rectangle extends Shape {

    private StringBuilder message = new StringBuilder();
    private int length;
    private int width;

    public Rectangle(String name, FigureProducer producer, ColorProducer colorProducer) {
        super(name,colorProducer);
        this.length = producer.generateRandomNumber();
        this.width = producer.generateRandomNumber();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public String displayInfo() {
        return message.append(super.displayInfo())
        .append(",area: " + this.calculateArea() + " sq.units ")
        .append("diagonal: " + this.getDiagonal() + " units ").toString();
    }

    public double getDiagonal() {
        double result = (Math.sqrt((width * width) + (length * length)));
        return Math.round(result);
    }

}
