import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;

/***
 * SERIALIZATION example
 */
public class WriteJson {

	public static void main(String[] args) {
		
		List spanishTeam = Arrays.asList(
		        new FootballPlayer(1, "Courtois", Arrays.asList("Goalkeeper"), "Real Madrid"),
			new FootballPlayer(15, "Ramos", Arrays.asList("Right back", "Centre-back"), "Real Madrid"),
			new FootballPlayer(3, "Pique", Arrays.asList("Centre-back"), "FC Barcelona"),
			new FootballPlayer(5, "Lenglet", Arrays.asList("Centre-back"), "FC Barcelona"),
			new FootballPlayer(11, "Roberto", Arrays.asList("Left back"), "FC Barcelona"),
			new FootballPlayer(14, "Kroos", Arrays.asList("Defensive midfield", "Midfield"), "Real Madrid"),
			new FootballPlayer(16, "Busquets", Arrays.asList("Defensive midfield"), "FC Barcelona"),
			new FootballPlayer(8, "Pedri", Arrays.asList("Midfielder"), "FC Barcelona"),
			new FootballPlayer(18, "Griezmann", Arrays.asList("Left winger", "False forward"), "FC Barcelona"),
			new FootballPlayer(6, "DeJong", Arrays.asList("Right winger", "Midfielder"), "FC Barcelona"),
			new FootballPlayer(7, "Messi", Arrays.asList("Centre forward"), "FC Barcelona")
				);
		
		String json = new Gson().toJson(spanishTeam);
		System.out.println(json);
		
	}
}
