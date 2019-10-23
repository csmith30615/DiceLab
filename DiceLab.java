package DiceLab;

import java.util.ArrayList;
/**
 * File meant to test whether the Die class is working properly or not.
 * Creates a set of 5 Die of random sizes (4, 6, 8, 10, 12, 20, or 200), rolls
 * them, and prints each Die's value
 * @author csmit
 */
public class DiceLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize variables
        int randNum = 0;
        int[] dieValues = {4, 6, 8, 10, 12, 20, 100};
        ArrayList<Die> dieList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        
        //Loop 5 times, create 5 Die, and print their 
        for(int i = 0; i < 5; i++){
            //Create Die with random amount of faces from the int[] dieValues and adds it to dieList
            dieList.add(new Die(dieValues[(int) (Math.random() * dieValues.length)]));
        }
        
        //Loop through all Die and roll them
        for (Die tempDie : dieList)
            tempDie.roll();
        
        //Creates and writes the String value of all 5 Die created
        sb.append(dieList.get(0).toString());
        for(int i = 0; i < 4; i++){
            sb.append(", ");
            sb.append(dieList.get(i + 1).toString());
        }
        
        System.out.println(sb.toString());
    }
    
}
