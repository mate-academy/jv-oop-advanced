package core.basesyntax;

public class Rectangle extends Shape {

    private StringBuilder message = new StringBuilder();
    private int length;
    private int width;

    public Rectangle(String name, FigureProducer producer) {
        super(name);
        this.length = producer.generatorNumber();
        this.width = producer.generatorNumber();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public String info() {
        return message.append(super.info()).append(",area: " + this.calculateArea() + " sq.units ")
        .append("diagonal: " + this.getDiagonal() + " units ").toString();
    }

    public double getDiagonal() {
        return (int)(Math.sqrt((width * width) + (length * length)));
    }

}
