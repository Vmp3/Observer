package observer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsOrganizationTeam {
    
    private List<GameStartObserver> observers = new ArrayList<>();

    public void addGameStartObserver(GameStartObserver observer)  {
        this.observers.add(observer);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 para iniciar uma partida: ");

        while (true) {
            int valor = scanner.nextInt();

            if (valor == 1) {
                GameStartEvent event = new GameStartEvent(new Date(System.currentTimeMillis()));

                for (GameStartObserver observer : this.observers) {
                    observer.gameStarted(event);
                }
                break; 
            } else {
                System.out.println("Opção inválida. Digite 1 para iniciar uma partida.");
            }
        }
    }

}
