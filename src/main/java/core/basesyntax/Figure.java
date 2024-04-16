package core.basesyntax;

public interface Figure {

    double getArea();

    void draw();

    default String getColor() {
        return "black";
    }
}