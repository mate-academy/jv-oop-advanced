package core.basesyntax;

public interface Area {

    double getArea();

    default double getAreaWithHeight(double side, double height) {
        return side * height / 2;
    }
}
