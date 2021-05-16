package gameSimulation.Abstract;

import gameSimulation.Entities.Campaign;
import gameSimulation.Entities.Customer;
import gameSimulation.Entities.Game;

public interface SaleService {
	
		void create(Game game, Customer customer);
		
		void create(Game game, Customer customer, Campaign campaign);
}
