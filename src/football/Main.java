package football;
import football.*;

public class Main {
    public static void main(String[] args) {
        Team team = createTeam("Pep Guardiola", "1", "Messi", "Ronaldinho", "Ronaldo"
                , "FV", "MD", "FV", "Barcelona", "Camp Nou");
        Team team2 = createTeam("Mourinho", "2", "Puyol", "Torres", "Benzema"
                , "DF", "FV", "FV", "Liverpool", "Anfield");
        Supporter supporter = new Supporter();
        supporter.name = "Barca";
        Supporter supporter2 = new Supporter();
        supporter2.name = "Live";
        Match match = new Match();
        match.homeTeam = team;
        match.awayTeam = team2;
        match.dateOfTheMatch = "12/12/2023";
        match.numOfFans = 55000;
        match.stadium = team.stadium;
        team.matches = new Match[]{match};
        team2.matches = new Match[]{match};


        match.supporters = new Supporter[]{supporter, supporter2};
        team.presentTeam();
        team2.presentTeam();
    }
    private static Team createTeam(String coachName, String ownerName, String playerName, String  playerName2, String playerName3, String playerOnePosition, String player2Pos
            ,String player3Pos, String nameOfTheTeam, String stadiumName) {
        System.out.println(System.lineSeparator() + "+++++++++++++++++++++++++++");
        Coach coach = new Coach();
        coach.name = coachName;
        coach.type = "Attack";

        Owner owner = new Owner();
        owner.name = ownerName;

        Player player = new Player();
        player.name = playerName;
        player.position = playerOnePosition;

        Player player2 = new Player();
        player2.name = playerName2;
        player2.position = player2Pos;
        Player player3 = new Player();
        player3.name = playerName3;
        player3.position = player3Pos;

        Stadium stadium = new Stadium();
        stadium.name = stadiumName;

        Team team = new Team();
        team.teamName = nameOfTheTeam;
        team.owner = owner;
        team.players = new Player[]{player, player2, player3};
        team.stadium = stadium;
        return team;
    }
}
