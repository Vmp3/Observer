package observer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsOrganizationTeam extends Thread {
    
    private List<GameStartObserver> observers = new ArrayList<GameStartObserver>();

    public void addGameStartObserver(GameStartObserver observer)  {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 para iniciar uma partida: ");

        while (true) {
            int valor = scanner.nextInt();

            if (valor == 1) {
                GameStartEvent event = new GameStartEvent(new Date(valor));

                for (GameStartObserver observer : this.observers) {
                    observer.gameStarted(event);
                }
            } else {
                System.out.println("Opção inválida. Digite 1 para iniciar uma partida.");
            }
        }
    }

}
