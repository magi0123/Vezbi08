package Prva;

import java.util.Map;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {

		Map<String, String> rechnik = new HashMap<String, String>();
		rechnik.put("book", "kniga");
		rechnik.put("game", "igra");
		rechnik.put("shirt", "bluza");
		rechnik.put("hi", "zdravo");
		rechnik.put("sunglasses", "naocari");

		System.out.println("Kluchevi: " + rechnik.keySet());
		System.out.println("Vrednosti: " + rechnik.values());

		for (Map.Entry<String, String> entry : rechnik.entrySet()) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}

		if (rechnik.containsKey("hi"))
			System.out.println("Vrednosta (prevodot) za 'hi' e :" + rechnik.get("hi"));
		else
			System.out.println("Ne postoi zbor hi.");
	}
}
