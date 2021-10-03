package core.basesyntax;

public class Circle extends Figure implements FigureInterface {

    public int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    @Override
    public double calculateArea() {
        return (3.1416 * radius * radius / 2) ;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: circle, area: " + calculateArea() +
                " sq.units, radius: " + radius + " units, color: " + color);
    }
}
