package core.basesyntax;

public class Circle extends Shapes implements Area, Draw {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String getDraw() {
        return ("Picture: " + ",area: " + getArea() + "radius : " + radius);
    }

    @Override
    String figure() {
        return "Circle";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Haven't corners");
    }
}
