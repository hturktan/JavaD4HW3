package JavaD4HW3;

public class PlayerManager implements PlayerService{

	
//	PlayerCheckService playerCheckService;
//	
//	public PlayerManager(PlayerCheckManager playerCheckManager) {
//	}
	
	
	@Override
	public void add(Player player) {
        System.out.println("Dear " + player.getFirstName() + " " + player.getLastName() + " your membership is completed");
		
	}

	@Override
	public void update(Player player) {
        System.out.println(player.getFirstName() + " " + player.getLastName() + " is updated his/her profile");
		
	}

	@Override
	public void delete(Player player) {
        System.out.println("Dear " + player.getFirstName() + " " + player.getLastName() + " is deleted his/her account");
		
	}

}
