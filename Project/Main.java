package Java_OOP.Project;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Base> firstTeam = new ArrayList<>();
        ArrayList<Base> secondTeam = new ArrayList<>();

        HeroTeam heroCreate = new HeroTeam();
        
        heroCreate.TeamsCreate(firstTeam, secondTeam, 10, 10);
        
        firstTeam.forEach(System.out::println);
        System.out.println();
        secondTeam.forEach(System.out::println);
                
    }
}
