package gameSimulation.Entities;

import gameSimulation.Abstract.Entity;

public class Game implements Entity{
		
		private int id;
		private String nameOfTheGame;
		private String gameType; 
		private double gamePrice;
		
		public Game(int id, String nameOfTheGame, String gameType, double gamePrice) {
			super();
			this.id = id;
			this.nameOfTheGame = nameOfTheGame;
			this.gameType = gameType;
			this.gamePrice = gamePrice;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNameOfTheGame() {
			return nameOfTheGame;
		}

		public void setNameOfTheGame(String nameOfTheGame) {
			this.nameOfTheGame = nameOfTheGame;
		}

		public String getGameType() {
			return gameType;
		}

		public void setGameType(String gameType) {
			this.gameType = gameType;
		}

		public double getGamePrice() {
			return gamePrice;
		}

		public void setGamePrice(double gamePrice) {
			this.gamePrice = gamePrice;
		}
		
		
}
