package core.basesyntax;

public class IsoscelesTrapezoid implements Figure{
    private int shortSide;
    private int longSide;
    private int height;

    public IsoscelesTrapezoid(int shortSide, int longSide, int height) {
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }


    @Override
    public double getArea() {
        return height * ((shortSide + longSide) / 2) ;
    }
}
