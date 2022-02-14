package pruebasunitarias.drive;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {
	private DriversManager driversManager = new DriversManager();
	@DisplayName("Pruebas para ver que eres chido")
	@Test
	void isAddPassenger() {
		Passenger passenger1 = new Passenger("Alex Rochin", "ABC123");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1,driversManager.getPassenger("ABC123"));
	}
	@Test
	void isAddDriver() {
		Driver driver1 = new Driver("Lola trailera","ID1",50.50);
		driversManager.addDriver(driver1);
		assertEquals(driver1,driversManager.getDriver("ID1"));
	}

}
