package core.basesyntax;

public interface QuadrangularArea {
    default double getQuadrangularArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }
}
