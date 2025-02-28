import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Zoo
{
    private ArrayList<Bird> zooBirds;
    
    public Zoo(){
        zooBirds = new ArrayList<>();
        zooBirds.add(new Bird ("blue", "BlueJay", 2));
        zooBirds.add(new Bird ("red", "BlueJay", 2));
        zooBirds.add(new Bird ("blue", "BlueJay", 2));
        zooBirds.add(new Bird ("red", "BlueJay", 2));
        zooBirds.add(new Bird ("blue", "BlueJay", 2));
    }
    
    int countBlueBirds()
    {
       int count = 0;
       for (Bird b : zooBirds)
       {
           if (b.getColor().equals("blue"))
           {
               count++;
           }
       }
       return count;
    }
    
    int countBlueBirdsWhile()
    {
        int count = 0;
        int index = 0;
        while(index<=zooBirds.size()){
            if(zooBirds.get(index).getColor().equals("blue")){
                count++;
            }
            index++;
        }
        return count;
    }
    
    public boolean zooBirds()
    {
       return zooBirds();
    }
}
