package Java_OOP.Project;

public class Monk extends Base {
    public Monk() {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "");
    }

    @Override
    public String toString()
    {
        return "Monk" + super.toString();        
    }
}
