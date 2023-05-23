public class City extends State{

    public City(int square, int population) {
        super(square, population);
    }

    @Override
    protected int populationDensity() {
        return super.populationDensity();
    }

    @Override
    void schet(int square, int population) {
        System.out.println("Население города: " + population + "; " + "Площадь города: " + square);
    }
}
