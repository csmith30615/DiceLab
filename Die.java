package DiceLab;

/**
 * Creates a Die object with a specified number of faces
 * @author csmit
 */
public class Die {
    //Initialize global variables
    private int faces, faceValue = 1;
    
    //Constructors
    /**
     * Die constructor with given number of faces
     * @param faces int amount of faces
     */
    public Die(int faces){
        this.faces = faces;
    }
    
    //Methods
    /**
     * Roll to randomize the int faceValue of the Die
     * @return int faceValue of the die
     */
    public int roll(){
        faceValue = 1 + (int)(Math.random() * this.faces);
        return this.faceValue;
    }
    
    //Getters
    /**
     * Gets the int faceValue of the Die
     * @return int faceValue of Die
     */
    public int getFaceValue(){
        return this.faceValue;
    }
    
    /**
     * Gets the int faces of the Die
     * @return int faces, amount of faces on the die
     */
    public int getNumFaces(){
        return this.faces;
    }
    
    /**
     * Returns the string format of the Die's int faces and int faceValue
     * @return String of int faces and int faceValue
     */
    @Override
    public String toString(){
        return "d" + this.faces + " = " + this.faceValue;
    }
}
