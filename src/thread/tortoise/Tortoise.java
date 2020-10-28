package thread.tortoise;

public class Tortoise extends Thread {
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");
    }

}
