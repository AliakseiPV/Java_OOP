package Java_OOP.Project;

public class Wizard extends Base {
    public Wizard() {
        super(17, 12, 0, new int[]{-5,-5}, 30, 9, false, true, "");
    }

    @Override
    public String toString()
    {
        return "Wizard" + super.toString();        
    }
}
