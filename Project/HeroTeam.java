package Java_OOP.Project;



import java.util.ArrayList;
import java.util.Random;

public class HeroTeam{

    public void TeamsCreate(ArrayList<Base> firstTeam, ArrayList<Base> secondTeam,int firstTeamCount, int secondTeamCount)
    {
        firstTeam = CreateFirstTeam(firstTeamCount);
        secondTeam = CreateSecondTeam(secondTeamCount);
    }

    private ArrayList<Base> CreateFirstTeam(int heroCount)
    {
        Random random = new Random();
        ArrayList<Base> firstTeam = new ArrayList<>();
        
        for (int i = 0; i < heroCount; i++) {
            int value = random.nextInt(0,4);
            switch (value) {
                case 0:
                firstTeam.add(new Peasant());
                    break;
                case 1:
                firstTeam.add(new Robber());
                    break;  
                case 2:
                firstTeam.add(new Sniper());
                    break;
                case 3:
                firstTeam.add(new Wizard());
                    break;                
                default:
                    break;
            }
        }
        return firstTeam;
    }

    private ArrayList<Base> CreateSecondTeam(int heroCount)
    {
        Random random = new Random();
        ArrayList<Base> secondTeam = new ArrayList<>();

        for (int i = 0; i < heroCount; i++) {
            int value = random.nextInt(0,4);
            switch (value) {
                case 0:
                secondTeam.add(new Monk());
                    break;
                case 1:
                secondTeam.add(new Peasant());
                    break;
                case 2:
                secondTeam.add(new Spearman());
                    break; 
                case 5:
                secondTeam.add(new Xbowman());
                    break;                
                default:
                    break;
            }
        }
        return secondTeam;
    }
}
