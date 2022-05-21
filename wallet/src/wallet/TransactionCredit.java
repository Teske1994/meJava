package wallet;

public class TransactionCredit{
    private int transactionId;
    private double creditAmount;

    TransactionCredit(int inId, double inAmount) {

        this.transactionId = inId;
        this.creditAmount = inAmount;
    }

    // getters and setters

    public int getTransactionId() {

        return transactionId;
    }

    public void setTransactionId(int id) {

        this.transactionId = id;
    }

    public double getCreditAmount() {

        return creditAmount;
    }

    public void setCreditAmountAmount(double amount) {

        this.creditAmount = amount;
    }

    @Override
    public String toString() {

        return "The transaction had the id of " + this.transactionId + " and the credited amount is " + this.creditAmount + ".";
    }
}
