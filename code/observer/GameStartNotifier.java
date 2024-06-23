package observer;

public class GameStartNotifier {
    
    public static void main(String[] args) {
        Fan fan = new Fan();
        SportsOrganizationTeam sportsOrganizationTeam = new SportsOrganizationTeam();

        sportsOrganizationTeam.addGameStartObserver(fan);

        sportsOrganizationTeam.start();
    }

}
