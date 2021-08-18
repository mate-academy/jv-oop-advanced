package core.basesyntax;

public class Square extends FourSided implements Informable, AreaCounter {

    public Square(String name, String color, int bottomSide, int topSide,
                  int leftSide, int rightSide) {
        super(name, color, bottomSide, topSide, leftSide, rightSide);
    }

    @Override
    public void countArea() {
        double area = getSide1() * getSide1();
        super.setArea(area);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + ", side: " + getSide1());
    }
}
