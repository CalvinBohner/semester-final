import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
		// TODO Load the "pasture" map at size 15 by 15
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
		
		
		Display.openWorld("src/maps/pasture.map");
        Display.setSize(15, 15);
        Display.setSpeed(6);
        
        Horse jeff = new Horse();
        jeff.wander(36, 7);
        
        
        
        
	}

}
