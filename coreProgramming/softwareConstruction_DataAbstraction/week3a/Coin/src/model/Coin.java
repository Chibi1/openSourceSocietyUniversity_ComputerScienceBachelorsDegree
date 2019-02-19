package model;


import java.util.Random;


public class Coin {
    private String coinStatus;

    // EFFECTS: returns coinStatus
    public String getCoinStatus() { return this.coinStatus; }

    //EFFECTS: sets coinStatus
    public void setCoinStatus(String status) { this.coinStatus = status; }

    // MODIFIES: this
    // EFFECTS: sets the status of the coin to heads or tails
    public void flipCoin() {
        Random random = new Random();
        Integer booleanCoin;
        booleanCoin = random.nextInt(2);
        if (booleanCoin == 0) {
            setCoinStatus("heads");
        } else {
            setCoinStatus("tails");
        }
    }
}