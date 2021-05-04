package JavaD4HW3;

public interface CampaignService {
	
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void calculateDiscountCampaign(Campaign campaign, Game game);

}
