package JavaD4HW3;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign is added into the system.");

	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign is updated into the system.");

	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign is deleted from the system.");

	}

	@Override
	public void calculateDiscountCampaign(Campaign campaign, Game game) {
		double newPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscountAmount())/100;
		System.out.println(game.getName() + " has a new price as " + newPrice + " via " + campaign.getName());

	}
}
