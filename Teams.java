import java.util.Scanner;

public class Teams {

    private String team1, team2;
    private int team1score, team2score;

    public static void main(String[] args){

        Teams teams = new Teams();

    }

    public Teams(){
        setTeams();
        whoWon();
    }

    public void setTeams(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Team 1: ");
        team1 = scanner.next();
        System.out.print("Team 1 score: ");
        team1score = scanner.nextInt();

        System.out.print("Team 2: ");
        team2 = scanner.next();
        System.out.println("Team 2 score: ");
        team2score = scanner.nextInt();

    }

    public void whoWon(){
        if (team1score < team2score){
            System.out.println("Team 2 won!");
        } else if(team1score > team2score){
            System.out.println("Team 1 won!");
        } else
            System.out.println("Draw!");
    }

}
