package wallet;

import java.util.ArrayList;
// list of all transactions ordered by date
public class MonetaryAccount extends Player{

    private double playerBalance;
    private ArrayList<TranscationDebit> debitTransactions;
    private ArrayList<TransactionCredit> creditTransactions;

    MonetaryAccount(int inId, String inNick) {
        super(inId, inNick);
        this.playerBalance = 0;
        this.debitTransactions = new ArrayList<>();
        this.creditTransactions = new ArrayList<>();
    }

    MonetaryAccount(double inBalance) {
        this.playerBalance = inBalance;
        this.debitTransactions = new ArrayList<>();
        this.creditTransactions = new ArrayList<>();
    }

    // getters and setters

    public double getPlayerBalance() {

        System.out.println("" + playerBalance);
        return playerBalance;
    }

    public void setPlayerCreditBalance(double creditBalance) {

        this.playerBalance += creditBalance;
    }

    public void setPlayerDebitBalance(double debitBalance) {

        this.playerBalance -= debitBalance;
    }

    public TranscationDebit getDebitPlayerTransactions() {

        if (this.debitTransactions.size() > 0) { // if the list is empty there is nothing to return

            for (TranscationDebit transaction : this.debitTransactions) {

                return transaction;
            }
        }
        return null;
    }

    public TransactionCredit getCreditPlayerTransactions() {

        if (this.creditTransactions.size() > 0) { // if the list is empty there is nothing to return

            for (TransactionCredit transaction : this.creditTransactions) {

                return transaction;
            }
        }
        return null;
    }


    public boolean deleteDebitTransaction(int transactionId) {

        if (this.debitTransactions.size() > 0) { // if the list is empty there is nothing to return

            for (TranscationDebit transaction : this.debitTransactions) {

                if (transaction.getTransactionId() == transactionId) {

                    this.debitTransactions.remove(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean debitPlayer(TranscationDebit transaction) {

        if (transaction != null) {

            if (this.debitTransactions.size() == 0) {

                if (this.playerBalance > transaction.getDebitAmount()) {


                    setPlayerDebitBalance(transaction.getDebitAmount());
                    this.debitTransactions.add(transaction);
                    return true;
                } else {

                    System.out.println("Not enough balance!");
                }
            }


                for (TranscationDebit t : this.debitTransactions) {

                    if (transaction.getTransactionId() != t.getTransactionId()) {

                        if (this.playerBalance > t.getDebitAmount()) {


                            setPlayerDebitBalance(t.getDebitAmount());
                            this.debitTransactions.add(transaction);
                            return true;
                        } else {

                            System.out.println("Not enough balance!");
                        }
                    }
                }
        }

        return false;
    }

    public void getDebitTransactions() {

        if (this.debitTransactions.size() > 0) {

            if (this.debitTransactions.size() == 0) {

                System.out.println("The player didn't make any transactions yet.");
            }

            System.out.println("Debit transaction list for player : " + this.getPlayerNick() + " [");

            for (TranscationDebit debit : this.debitTransactions) {

                System.out.println(debit.toString());
            }

            System.out.println("]");
        }
    }

    // CREDITING


    public boolean deleteCreditTransaction(int transactionId) {

        if (this.creditTransactions.size() > 0) {

            for (TransactionCredit transaction : this.creditTransactions) {

                if (transaction.getTransactionId() == transactionId) {

                    this.creditTransactions.remove(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean creditPlayer(TransactionCredit transaction) {

        if (transaction != null) {

            if (this.creditTransactions.size() == 0) {

                setPlayerCreditBalance(transaction.getCreditAmount());
                this.creditTransactions.add(transaction);
                return true;
            }

                for (TransactionCredit t : this.creditTransactions) {

                    if (transaction.getTransactionId() != t.getTransactionId()) {

                        setPlayerCreditBalance(transaction.getCreditAmount());
                        this.creditTransactions.add(transaction);
                        return true;
                    }
                }

        }
        return false;
    }

    public void getCreditTransactions() {

        if (this.creditTransactions.size() > 0) {

            if (this.creditTransactions.size() == 0) {

                System.out.println("The player didn't make any transactions yet.");
            }

            System.out.println("Credit transaction list for player : " + this.getPlayerNick() + " [");

            for (TransactionCredit credit : this.creditTransactions) {

                System.out.println(credit.toString());
            }

            System.out.println("]");
        }
    }




}

