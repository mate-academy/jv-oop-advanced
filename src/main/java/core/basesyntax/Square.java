package core.basesyntax;

public class Square extends ColorSupplier implements Figure {
    private static int side1;
    private static int side2;

    public static int getSide1() {
        return side1;
    }

    public static int getSide2() {
        return side2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public void setColor(String color) {
    }

    @Override
    public String getColor() {
        return "";
    }

    @Override
    public void draw() {
    }
}
