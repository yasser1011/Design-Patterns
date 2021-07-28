package strategy;

public class DefendStrategy implements TeamStrategy{
    @Override
    public void play(String team) {
        System.out.println(team + " will play defense");
    }
}
