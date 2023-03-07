package football;

public class Team {
    public String teamName;
    public Player[] players;
    public Owner owner;
    public Stadium stadium;
    public Match[] matches;

    public void presentTeam(){
        System.out.println("++++++++++++++++");
        System.out.println("Name of the team: "+ teamName);
        System.out.println("OWNER:"+ owner.name);
        System.out.println("Stadium: "+ stadium.name);
        System.out.println("Players: ");
        for (int i=0;i<players.length;i++){
            System.out.println("-" + players[i].name +" position "+ players[i].position );
        }
        System.out.println("Matches ");
        for(int i=0; i<matches.length; i++){
            System.out.println("- we will play against " + (teamName.equals(matches[i].homeTeam.teamName)? matches[i].awayTeam.teamName : matches[i].homeTeam.teamName));
            System.out.println("Stadium where this match will be played: "+matches[i].homeTeam.stadium.name);
            System.out.println("Supporters: ");
            for(int j = 0;j<matches[i].supporters.length; j++){
                System.out.println("Name "+ matches[i].supporters[j].name);
            }
        }
    }
}
