package Java_OOP.Project;

import java.util.ArrayList;
import java.util.Random;

public class HeroTeam {

    public static String Find(ArrayList<Base> heroTeam, int heroId)
    {
        for (Base base : heroTeam) {
            if(heroId == base.getPlayerID())
            {
                return base.toString();
            }
        }

        return "There is no hero with such an index";
    }

    public ArrayList<Base> Create(int heroCount)
    {
        Random random = new Random();
        ArrayList<Base> list = new ArrayList<>();

        for (int i = 0; i < heroCount; i++) {
            int value = random.nextInt(0,7);
            switch (value) {
                case 0:
                list.add(new Monk());
                    break;
                case 1:
                list.add(new Peasant());
                    break;
                case 2:
                list.add(new Robber());
                    break;  
                case 3:
                list.add(new Sniper());
                    break;
                case 4:
                list.add(new Spearman());
                    break; 
                case 5:
                list.add(new Wizard());
                    break; 
                case 6:
                list.add(new Xbowman());
                    break;                
                default:
                    break;
            }
        }
        return list;
    }

}
