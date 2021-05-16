package gameSimulation;

import java.time.LocalDate;

import gameSimulation.Abstract.BaseCustomerManager;
import gameSimulation.Adapters.EDevletServiceControl;
import gameSimulation.Concrete.CustomerManager;
import gameSimulation.Concrete.GameManager;
import gameSimulation.Concrete.SaleManager;
import gameSimulation.Entities.Campaign;
import gameSimulation.Entities.Customer;
import gameSimulation.Entities.Game;
import gameSimulation.Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		Customer furkan = new Customer(1, "Furkan", "Yurdal", LocalDate.of(2001, 11, 06), "33333333333");
		BaseCustomerManager customerManager = new CustomerManager(new EDevletServiceControl());
		customerManager.save(furkan);
		
		Game callOfDuty = new Game(1, "Call Of Duty", "Savas-Aksiyon", 99.90);
		Game farCry = new Game(2, "Far Cry", "Savas-Aksiyon", 125);
		
		GameManager gameManager = new GameManager();
		gameManager.add(farCry);
		gameManager.add(callOfDuty);
		
		Game[] games = {callOfDuty, farCry};
		
		Campaign endOFMay = new Campaign(1, "Mayýs sonu", 35, games);
		
		Sale sale = new Sale(1, furkan, games);
		SaleManager saleManager = new SaleManager();
		saleManager.create(farCry, furkan, endOFMay);
		saleManager.create(callOfDuty, furkan);
		System.out.println(sale.getTotalPrice());
	}

}
