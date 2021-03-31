package core.basesyntax;

public class Rectangle extends Shapes implements Area,Draw {
    private int side1;
    private int side2;

    public void Shaped(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String getDraw() {
        return ("Picture: " + ",area: " + getArea() + ",side1: " + side1 +" ,side2: "+side2);
    }

    @Override
    public int getArea() {
        return side1 * side2;
    }


    @Override
    String figure() {
        return "Rectangle";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 4 corners");
    }
}
