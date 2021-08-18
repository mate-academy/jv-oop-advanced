package core.basesyntax;

public class Rectangle extends FourSided implements Informable, AreaCounter {

    public Rectangle(String name, String color, int bottomSide, int topSide,
                     int leftSide, int rightSide) {
        super(name, color, bottomSide, topSide, leftSide, rightSide);
    }

    @Override
    public void countArea() {
        double area = getSide1() * getSide4();
        super.setArea(area);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + ", bottom side: "
                + getSide1() + ", top side: " + getSide2() + ", left side: "
                + getSide3() + ", right side: " + getSide4());
    }
}
