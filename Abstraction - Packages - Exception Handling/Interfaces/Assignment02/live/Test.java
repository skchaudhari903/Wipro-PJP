package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena veena = new Veena();
		Saxophone saxophone = new Saxophone();
		veena.play();
		saxophone.play();
		
		Playable veenaObj = new Veena();
		Playable saxophoneObj = new Saxophone();
		veena.play();
		saxophoneObj.play();
	}

}
