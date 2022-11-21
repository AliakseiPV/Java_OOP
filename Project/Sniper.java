package Java_OOP.Project;

public class Sniper extends Base {
    public Sniper() {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "");
    }

    @Override
    public String toString()
    {
        return "Sniper" + super.toString();        
    }
}
