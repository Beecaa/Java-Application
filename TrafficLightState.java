
public class TrafficLightState{
	
	public static void main(String args[]) {
		
	enum TrafficLight {RED, YELLOW, GREEN}; // stores the constants
	
		TrafficLight currentLight = TrafficLight.YELLOW;
		
		switch(currentLight)
		{
			case RED:
					System.out.println("Stop");
			break;
			case YELLOW:
					System.out.println("Get Ready");
			break;
			case GREEN:
					System.out.println("Go");
			break;
		}
	}
}
		

			