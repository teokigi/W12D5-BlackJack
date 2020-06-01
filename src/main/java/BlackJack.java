import java.util.ArrayList;
import java.util.Collection;

public class BlackJack {


    private final ArrayList<Player> players;

    public BlackJack() {
        this.players = new ArrayList<Player>();
    }


    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealCards(Deck deck) {
        for (Player player : this.players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
        }
    }

    public void twist(Player player,Deck deck){
        player.addCard(deck.dealCard());
    }


//    public ArrayList<Player> getWinner() {
//        ArrayList<Player> winners;
//        winners = new ArrayList<Player>();
//        int winningValue = 0;
//        for (Player player : this.players) {
//            int playerCardValue = player.getHand().get(0).getValueFromEnum();
//             if (winningValue < playerCardValue){
//                    winners.add(player);
//                    winningValue = playerCardValue;
//             } else if (winningValue == playerCardValue) {
//                 winners.add(player);
//             }
//        }
//        return winners;
//    }
}
