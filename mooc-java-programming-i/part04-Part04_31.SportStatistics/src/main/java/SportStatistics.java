
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<SportsMatch> sportsScores=new ArrayList<>();
        try (Scanner in = new Scanner(Paths.get(fileName))) {
            while (in.hasNextLine()) {
                String thisLine=in.nextLine();
                String[] sportsInfo=thisLine.split(",");
                String homeTeam=sportsInfo[0];
                String visitingTeam=sportsInfo[1];
                int homeTeamPoints=Integer.valueOf(sportsInfo[2]);
                int visitingTeamPoints=Integer.valueOf(sportsInfo[3]);
                sportsScores.add(new SportsMatch(homeTeam,visitingTeam,homeTeamPoints,visitingTeamPoints));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Team:");
        String teamName=scan.nextLine();
        int teamNameCount=0;
        int winCount=0;

        for (SportsMatch items :sportsScores){
            int homeTeamScore=items.getHomeTeamPoints();
            int visitingTeamScore=items.getVisitingTeamPoints();
            if (items.getHomeTeam().equals(teamName) ){
                teamNameCount++;

                if (homeTeamScore>visitingTeamScore){
                    winCount++;
                }

            } else if (items.getVisitingTeam().equals(teamName)){
                teamNameCount++;
                if (homeTeamScore<visitingTeamScore){
                    winCount++;
                }
            }
        }
        System.out.println("Games: "+teamNameCount);
        System.out.println("Wins: "+winCount);
        System.out.println("Losses: "+(teamNameCount-winCount));

    }
}
