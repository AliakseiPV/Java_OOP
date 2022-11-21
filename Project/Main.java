package Java_OOP.Project;

public class Main {
    public static void main(String[] args) {

        HeroTeam heroCreate = new HeroTeam();

        var heroTeam = heroCreate.Create(50);

        heroTeam.forEach(System.out::println);
        System.out.println();
        
        System.out.println( HeroTeam.Find(heroTeam, 10));
                
    }
}
