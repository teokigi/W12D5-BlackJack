import java.util.ArrayList;

public class Player {

    private final String name;
    private final ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }


    public void clearHand() {
        this.hand.clear();
    }

    public int getHandTotal() {
        int handTotal = 0;
        boolean hasAce = false;
            for (Card card : hand) {
                handTotal += card.getValueFromEnum();
                if (card.getRank() == RankType.ACE) {
                    hasAce = true;
                }
            }

        if ((hasAce == true) && ( handTotal <= 11)){
            handTotal += 10;

        }
        return handTotal;
    }

    public boolean isPlayerSafe(){
        if (getHandTotal() <= 21){
            return true;
        } else {
            return false;
        }
    }
}
