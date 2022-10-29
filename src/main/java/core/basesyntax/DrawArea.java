package core.basesyntax;

public interface DrawArea extends GetArea {
    default void drawArea() {
        System.out.println("Area is " + getArea());
    }
}
