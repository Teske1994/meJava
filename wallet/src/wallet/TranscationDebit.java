package wallet;

public class TranscationDebit{

        private int transactionId;
        private double debitAmount;

        TranscationDebit(int inId, double inAmount) {

            this.transactionId = inId;
            this.debitAmount = inAmount;
    }

    // getters and setters

    public int getTransactionId() {

            return transactionId;
    }

    public void setTransactionId(int id) {

            this.transactionId = id;
    }

    public double getDebitAmount() {

            return debitAmount;
    }

    public void setDebitAmount(double amount) {

            this.debitAmount = amount;
    }

    @Override
    public String toString() {

        return "The transaction had the id of " + this.transactionId + " and the debited amount is " + this.debitAmount + ".";
    }

}
