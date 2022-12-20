package Vtora;

import java.util.HashMap;
import java.util.Map;

public class Rechnik {
	Map<String, String> rechnik = new HashMap<String, String>();

	public void vnesiMapa() {
		rechnik.put("book", "kniga");
		rechnik.put("game", "igra");
		rechnik.put("shirt", "bluza");
		rechnik.put("hi", "zdravo");
	}

	public void translate(String s) {
		if (rechnik.containsKey(s)) {
			System.out.println(rechnik.get(s));
		} else
			System.out.println("Ne postoi takov zbor vo rechnikot.");
	}
}
