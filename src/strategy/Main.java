package strategy;

public class Main {
    public static void main(String[] args) {
        Team teamGermany = new TeamGermany();
        teamGermany.setTeamName("Germany");
        teamGermany.setTeamStrategy(new DefendStrategy());
        teamGermany.playGame();
    }
}
