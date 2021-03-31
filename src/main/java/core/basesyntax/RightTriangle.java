package core.basesyntax;

public class RightTriangle extends Shapes implements Area, Draw {
    private int height;
    private int leg;

    public RightTriangle(int height, int leg, String color) {
        super(color);
        this.height = height;
        this.leg = leg;
    }

    @Override
    public String getDraw() {
        return ("Picture: " + ",area: " + getArea() + "leg length: " + leg);
    }

    @Override
    public int getArea() {
        return height * leg;
    }

    @Override
    String figure() {
        return "RightTriangle";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 3 corners");
    }
}

