package coreJava.Abstraction;
/*
 * A code is said to be loosely couple if client code is not dependent on 
 * implementation class.
 * */

interface Player {
	public void play();
}

class MP4Player implements Player {

	@Override
	public void play() {
		System.out.println("MP4 song format is playing");

	}

}

class AVIPlayer implements Player {

	@Override
	public void play() {
		System.out.println("AVI song format is playing");
	}

}

class PlayerFactory {
	public Player getPlayer(String fileName) {
		if (fileName.endsWith(".mp4")) {
			return new MP4Player();
		} else {
			return new AVIPlayer();
		}
	}
}

public class LooselyCoupledCodeWithInterfaces {

	public static void main(String[] args) {
		String fileName = "test.mp4";
		PlayerFactory pf = new PlayerFactory();
		Player player = pf.getPlayer(fileName);
		if (player != null) {
			player.play();
		}
	}

}
