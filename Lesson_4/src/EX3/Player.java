package EX3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Проигрывается");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }

    @Override
    public void record() {
        System.out.println("Запись");
    }
}
