package country;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the the name of the country");
		String input = br.readLine();

		Continent continent;

		switch (input.toLowerCase()) { // input our country
		case "Ukraine":
		case "Poland":
		case "Sweden":
			continent = Continent.EUROPA;
			System.out.println("Continent - EUROPA");
			break;

		case "China":
		case "Japan":
		case "Korea":
			continent = Continent.ASIA;
			System.out.println("Continent - ASIA");
			break;

		case "Australia":
			continent = Continent.AUSTRALIA;
			System.out.println("Continent - AUSTRALIA");
			break;

		case "Mexica":
		case "Argentina":
		case "Venisuella":
			continent = Continent.SOUTH_AMERIKA;
			System.out.println("Continent - SOUTH_AMERIKA");
			break;

		default:
			System.out.println("No this country");
			System.exit(0);

		}
	}
}