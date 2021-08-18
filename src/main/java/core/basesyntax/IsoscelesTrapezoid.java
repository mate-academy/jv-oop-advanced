package core.basesyntax;

public class IsoscelesTrapezoid extends FourSided implements Informable, AreaCounter {

    public IsoscelesTrapezoid(String name, String color, int bottomSide,
                              int topSide, int leftSide, int rightSide) {
        super(name, color, bottomSide, topSide, leftSide, rightSide);
    }

    @Override
    public void countArea() {
        int difference = (getSide2() - getSide1()) / 2;
        difference = (difference < 0) ? difference * (-1) : difference;
        double height = Math.sqrt((difference * difference) + (getSide3() * getSide3()));
        double area = (getSide1() + getSide2()) / 2 * height;
        super.setArea(area);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + ", bottom side: "
                + getSide1() + ", top side: " + getSide2() + ", left side: "
                + getSide3() + ", right side: " + getSide4());
    }
}
