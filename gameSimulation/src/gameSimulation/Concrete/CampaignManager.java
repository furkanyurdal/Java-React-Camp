package gameSimulation.Concrete;

import gameSimulation.Abstract.CampaignService;
import gameSimulation.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya sisteme eklendi.");
		}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sistemden silindi.");
		}
	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi.");
		}
}
