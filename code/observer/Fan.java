package observer;

public class Fan implements GameStartObserver {
    
    @Override
    public void gameStarted(GameStartEvent event) {
        System.out.println("Notificando os fãs...");
        System.out.println("A partida começou! Vamos torcer!");
    }

}
