package strategy;

public abstract class Team {
    private String teamName;
    private TeamStrategy teamStrategy;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamStrategy(TeamStrategy teamStrategy) {
        this.teamStrategy = teamStrategy;
    }

    public String getTeamName() {
        return teamName;
    }

    public TeamStrategy getTeamStrategy() {
        return teamStrategy;
    }

    abstract void teamInfo();
    void playGame(){
        teamStrategy.play(teamName);
    }
}
