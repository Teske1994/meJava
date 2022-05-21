package wallet;

import java.util.ArrayList;

public class PlayerMonetaryAccounts {

    private ArrayList<MonetaryAccount> accounts;

    PlayerMonetaryAccounts() {

        this.accounts = new ArrayList<>();
    }

    // getters and setters

    public ArrayList<MonetaryAccount> getAccounts() {

        return accounts;
    }


    public boolean addMonetaryAccount(MonetaryAccount account) {

        if (account != null) {

            if (this.accounts.size() == 0) {

                this.accounts.add(account);
            }

            for (MonetaryAccount acc : this.accounts) {

                if (acc.getPlayerId() != account.getPlayerId()) {

                    this.accounts.add(account);
                    return true;
                }
            }
        }


        return false;
    }

    public void setAccounts(ArrayList<MonetaryAccount> accounts) {

        this.accounts = accounts;
    }

    public void getAllPlayers() {

        if (this.accounts.size() > 0) {

            for (MonetaryAccount account : this.accounts) {

                System.out.println("Player nickname: " + account.getPlayerNick() + ", Player id: " + account.getPlayerId() + ", Player balance: " +
                        account.getPlayerBalance() + ", account created on: " + account.getAccountCreated());
            }
        }
    }

}
