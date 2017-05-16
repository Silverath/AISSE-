import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import aiss.model.lol.*;
import aiss.model.resource.LoLResource;

public class LoLSummonerIdTest {

	static LoLResource lolres = new LoLResource();

	@Test
	public void testId() {
		String summoner = "LordOfDark";

		LoLID name = lolres.getSummoner(summoner);
		assertNotNull("El test no ha funcionado", name);
	}

}
