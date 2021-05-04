package JavaD4HW3;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public void checkPlayer(Player player) {
		if(player.getNationalId().length() == 11) {
			System.out.println("Verification is completed");
		}else{
			System.out.println("Verification is failed");
		}
	}

}
