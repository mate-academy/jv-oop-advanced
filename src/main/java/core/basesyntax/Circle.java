package core.basesyntax;

public class Circle extends Figure implements FigureDetailer {
    private String name = String.valueOf(FigureE.CIRCLE);
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public void getArea() {
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public void getDetails() {
        System.out.print(getColor() + " " + name + " with radius " + radius + " and area of ");
        getArea();
    }

}
