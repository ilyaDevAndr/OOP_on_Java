package interfaces;

public class Povar implements Driver,Worker{
    @Override
    public void work() {
        System.out.println("Повар работает");

    }

    @Override
    public void drive() {
        System.out.println("Повар водит");
    }
}
