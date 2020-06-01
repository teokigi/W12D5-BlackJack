import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    String name;
    Card card;
    Card card2;


    @Before
    public void before(){
        name = "Dave";
        player = new Player(name);
        card = new Card(SuitType.HEARTS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void hasName(){
        assertEquals("Dave", player.getName());
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void canTakeCard(){
        player.addCard(card);
        assertEquals(1, player.getHand().size());
    }

    @Test
    public void canClearHand(){
        player.addCard(card);
        player.clearHand();
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void checkHandTotal(){
        // players need a get total hand value function.
        // Each player if they get an Ace,
        // hand total +11 if current total <= 10 otherwise +1
        assertEquals(0,player.getHandTotal());
        player.addCard(card2);
        assertEquals(10,player.getHandTotal());
        player.addCard(card);
        assertEquals(21,player.getHandTotal());
        player.addCard(card);
        assertEquals(12,player.getHandTotal());

    }


}
