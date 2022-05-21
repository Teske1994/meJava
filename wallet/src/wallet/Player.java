package wallet;

import java.time.LocalDate;
import java.util.ArrayList;

public class Player {

    private int playerId;
    private String playerNick;
    private LocalDate accountCreated;


    // constructors for class Player
    Player() {

        this.playerNick = "";
        this.accountCreated = LocalDate.now();
    }

    Player(int inId, String inNick) {

        this.playerId = inId;
        this.playerNick = inNick;
        this.accountCreated = LocalDate.now();
    }

    // getters and setters for Player

    public int getPlayerId() {

        return playerId;

    }

    public void setPlayerId(int playerId) {

        if (playerId > 0) {

            this.playerId = playerId;
        }
    }


    public String getPlayerNick() {

        return playerNick;
    }

    public void setPlayerNick(String playerNick) {

        if (playerNick != null) {

            this.playerNick = playerNick;
        }
    }

    public LocalDate getAccountCreated() {

        return accountCreated;
    }


    @Override
    public String toString() {

        return "Player " + this.playerNick + " has created an account with us on " + this.accountCreated + ".";
    }
}
