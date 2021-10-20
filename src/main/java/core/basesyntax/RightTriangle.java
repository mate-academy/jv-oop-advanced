package core.basesyntax;

public class RightTriangle extends Rectangle {

    RightTriangle(String color, int leftLeg, int rightLeg) {
        super(color, leftLeg, rightLeg);
    }

    @Override
    double area() {
        return super.area() / 2;
    }

    @Override
    String nameOfFigure() {
        return "rightTriangle";
    }

    @Override
    void infoAboutFigure() {
        System.out.println(new StringBuilder().append("Figure: rightTriangle, area: ")
                .append(area()).append(" sq.units, leftLeg: ").append(getLeftLeg())
                .append(" units, rightLeg: ").append(getRightLeg()).append(" units, color: ")
                .append(getColor()));
    }
}
