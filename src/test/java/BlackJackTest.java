import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BlackJackTest {

    BlackJack game;
    Player player1;
    Player player2;
    Player player3;
    private Deck deck;


    @Before
    public void before() {
        game = new BlackJack();
        player1 = new Player("Dealer");
        player2 = new Player("Dom");
        player3 = new Player("Darlene");
        deck = new Deck();
        deck.populateDeck();

    }

    @Test
    public void hasNoPlayers(){
        assertEquals(0, game.getPlayers().size());
    }

    @Test
    public void canAddPlayers(){
        game.addPlayer(player1);
        assertEquals(1, game.getPlayers().size());
    }

    @Test
    public void canDealCards(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.dealCards(deck);
        assertEquals(1, game.getPlayers().get(0).getHand().size());
    }
    //test needs to:
    // note: Dealer is player 1,
    // note: 2 Additional players are pitted against dealer

    // 2 players starts with 2 dealt cards.
    // Dealer 2nd card is revealed.
    // Each player twists or sticks
    // BJ - player3 will twist till over 21 and go bust

    // Runner>BJ - bust players automatically lose.
    // Runner>BJ dealer will autoplay, twisting if handvalue < 16
    // players who haven't gone bust yet will be pitted against
    // dealer


//    @Test
//    public void canGetWinner(){
//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        game.addPlayer(player3);
//        game.dealCards(deck);
//        ArrayList<Player> winners = game.getWinner();
//        assertEquals(1, winners.size());
//    }

}
