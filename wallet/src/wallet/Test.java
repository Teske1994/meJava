package wallet;

public class Test {

    public static void main(String[] args) {

        PlayerMonetaryAccounts accounts = new PlayerMonetaryAccounts();

        MonetaryAccount player1 = new MonetaryAccount(1, "Teske");
        MonetaryAccount player2 = new MonetaryAccount(2, "Nenad");

        TransactionCredit credit1 = new TransactionCredit(1, 100.00);
        TransactionCredit credit2 = new TransactionCredit(2, 50.00);
        TransactionCredit credit3 = new TransactionCredit(3, 50.00);
        TransactionCredit credit4 = new TransactionCredit(4, 50.00);
        TransactionCredit credit5 = new TransactionCredit(5, 50.00);
        TranscationDebit debit = new TranscationDebit(1, 50.00);
        TranscationDebit debit2 = new TranscationDebit(2, 75.00);
        TranscationDebit debit3 = new TranscationDebit(3, 75.00);
        TranscationDebit debit4 = new TranscationDebit(4, 75.00);
        TranscationDebit debit5 = new TranscationDebit(5, 75.00);


        accounts.addMonetaryAccount(player1);
        accounts.addMonetaryAccount(player2);

        accounts.getAllPlayers();

        player1.creditPlayer(credit1);
        player2.creditPlayer(credit2);
        player1.creditPlayer(credit3);
        player1.creditPlayer(credit4);
        player1.creditPlayer(credit5);



        player1.getPlayerBalance();
        player2.getPlayerBalance();

        player1.debitPlayer(debit);
        player1.debitPlayer(debit3);
        player1.debitPlayer(debit4);
        player1.debitPlayer(debit5);
        player2.debitPlayer(debit2);



        player1.getPlayerBalance();
        player2.getPlayerBalance();

        player1.getCreditTransactions();
        player2.getCreditTransactions();

        player1.getDebitTransactions();
        player2.getDebitTransactions();
    }
}
