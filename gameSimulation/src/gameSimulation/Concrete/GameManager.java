package gameSimulation.Concrete;

import gameSimulation.Abstract.GameService;
import gameSimulation.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getNameOfTheGame() + " kütüphaneye eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getNameOfTheGame() + " kütüphaneden silindi.");
		
	}

}
