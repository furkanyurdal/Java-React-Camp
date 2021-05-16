package gameSimulation.Entities;

import gameSimulation.Abstract.Entity;

public class Sale implements Entity{
	
		private int id;
		private double totalPrice;
		private Customer customer;
		private Game[] games;
		
		public Sale() {}
			
		public Sale(int id, Customer customer, Game[] games) {
		super();
		this.id = id;
		this.customer = customer;
		this.games = games;
		
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getTotalPrice() {
			for (Game game : games) {
				totalPrice += game.getGamePrice();
			}
			return totalPrice;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Game[] getGames() {
			return games;
		}

		public void setGames(Game[] games) {
			this.games = games;
		}





}
