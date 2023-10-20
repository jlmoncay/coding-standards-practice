package maven;

import java.util.Scanner;

public class VacationCostEstimator {

	private String destination;
	private int numberOfTravelers;
	private int durationOfTheVacation;
	public static int baseCost = 1000;
	
	public String getDestination() {
		return destination;
	}
	
	public int getNumberOfTravelers() {
		return numberOfTravelers;
	}
	
	public int getDurationOfTheVacation() {
		return durationOfTheVacation;
	}
	
	public VacationCostEstimator(String destination, int numTravelers, int duration) {
		super();
		this.destination = destination;
		this.numberOfTravelers = numTravelers;
		this.durationOfTheVacation = duration;
	}
	
	
	public static int calculate(VacationCostEstimator Person) {
			
		if (Person.getDestination().toLowerCase().equals("paris"))
			return baseCost + 500;
		
		else if (Person.getDestination().toLowerCase().equals("new york city"))
			return baseCost + 600;
		
		else if ((Person.getNumberOfTravelers() >= 4) && (Person.getNumberOfTravelers() < 10))
			return (baseCost * 10) / 100;
		
		else if (Person.getNumberOfTravelers() > 10)
			return (baseCost * 20) / 100;
		
		else if (Person.getDurationOfTheVacation() < 7)
			return baseCost + 200;
		
		else if (Person.getDurationOfTheVacation()>30 || Person.getNumberOfTravelers() == 2)
			return baseCost - 200;
		
		else if (Person.getNumberOfTravelers() > 80)
			System.out.println("El servicio no se encuentra disponible para tal cantidad de personas. ");
			return 0;

	}
	
	
	
	public static void main(String[] args) {
	
			Scanner sc = new Scanner (System.in);
	
			System.out.println("Ingrese el número de pasajeros: ");
			int travelers = sc.nextInt();
	
			System.out.println("Ingrese el lugar de destino: ");
			String destination = sc.next();
	
			System.out.println("Ingrese la duración de su viaje: ");
			int duration = sc.nextInt();
	
			VacationCostEstimator person = new VacationCostEstimator(destination,travelers,duration);
			
			System.out.println("El valor a pagar es: " + calculate(person));
			
	}
}





	
	
	
