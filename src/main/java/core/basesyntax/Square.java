package core.basesyntax;

public class Square extends Figure implements AreaCalculatable {
    private double side;

    public Square(String name, String color, double area, double side) {
        super(name, color, area);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + area + "; " + "Side: " + side + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
