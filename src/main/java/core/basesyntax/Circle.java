package core.basesyntax;

public class Circle extends Shapes implements Area, Draw {
    private int radius;

    public void Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius);
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
        System.out.println("Haven`t corners");
    }
}
