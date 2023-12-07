package tek.week_4.day_3;

public class SportRanking {

/*    Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.

    Steps:

    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.

*/

    public static void main(String[] args) {

       // Dynamic Implementation

        String[] teams = new String[5];

        teams[0] = "Team1";
        teams[1] = "Team2";
        teams[2] = "Team3";
        teams[3] = "Team4";
        teams[4] = "Team5";

        System.out.println("Number one team in the list is: " + teams[0] );

       // Static Implementation

        String[] teamNames = {"Team1", "Team2", "Team3", "Team4", "Team5"};

        System.out.println("Number one team in the list is: " + teams[0] );

        // HomeWork: Ask the user for their input and ask them which ranking do they want to see!

    }
}
