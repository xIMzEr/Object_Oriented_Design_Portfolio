package test.lib;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import lib.Player;
import lib.Name;

class playerTest {

	@Test
	void splitNameTest() {
		Player player1 = new Player();
		player1.setFullPlayerName("James Deane");
		
		
		Name playerExpected = new Name("James", "Deane");
		Player expectedResult = new Player(playerExpected);
		Name expectedResultName = expectedResult.getName();
		
		Name result = player1.getName();
		
		assertEquals("The player name should be" + "Thomas" + "Barnes", playerExpected, result);
	}

}
