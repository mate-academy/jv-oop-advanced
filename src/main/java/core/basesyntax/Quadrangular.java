package core.basesyntax;

public interface Quadrangular {
    default double calculateQuadrangularArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }
}
