public class State {
    protected int square;
    protected int population;

    public State(int square, int population) {
        this.square = square;
        this.population = population;
    }

    protected int populationDensity () {
        return population / square;
    }

    void schet(int square, int population) {
        System.out.println("Население страны: " + population + "; " + "Площадь страны: " + square);
    }

}
