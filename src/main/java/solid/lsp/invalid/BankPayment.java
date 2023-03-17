package solid.lsp.invalid;

import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        // logic
    }

    @Override
    public Object status() {
        // logic
        return null;
    }

    @Override
    public List<Object> getPayments() {
        // logic
        return null;
    }

    @Override
    public void intiateLoanSettlement() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException();
    }

}
