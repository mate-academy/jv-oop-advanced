package core.basesyntax;

public class IsoscelesTrapezoid extends Shapes implements Area,Draw {
    private int side;
    private int height;

    public void IsoscelesTrapezoid(int side, int height) {
        this.height = height;
        this.side = side;
    }

    @Override
    public String getDraw() {
        return ("Picture: " + ",area: " + getArea() + ",side length: " + side+", height: "+height);
    }

    @Override
    public int getArea() {
        return side * height;
    }



    @Override
    String figure() {
    return "IsoscelesTrapezoid";
    }

    @Override
    void uniqueProperty() {
    System.out.println("Have 4 corners");
    }
}
