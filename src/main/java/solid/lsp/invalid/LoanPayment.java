package solid.lsp.invalid;

import java.util.List;

public class LoanPayment implements Payment {
    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException("This is not a bank payment");
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
        // logic
    }

    @Override
    public void initiateRePayment() {
        // logic
    }
}
