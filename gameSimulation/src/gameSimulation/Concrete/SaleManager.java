package gameSimulation.Concrete;

import gameSimulation.Abstract.SaleService;
import gameSimulation.Entities.Campaign;
import gameSimulation.Entities.Customer;
import gameSimulation.Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void create(Game game, Customer customer) {
		System.out.println("Ürün basariyla alindi.");
		
	}

	@Override
	public void create(Game game, Customer customer, Campaign campaign){
		double newPrice = (game.getGamePrice() * campaign.getDiscountRate()) / 100; 
		System.out.println("Ürün indirimli olarak alindi : " + newPrice);
		
	}

}
