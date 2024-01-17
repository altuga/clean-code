package org.jugistanbul.part1.cyclomatic;

public class OrderValidationBad {

    // Reduce complexity of the code
    public boolean isOrderValid(Order order) {
        if (order != null) {
            if (order.getItems() != null && !order.getItems().isEmpty()) {
                for (OrderItem item : order.getItems()) {
                    if (item.getQuantity() <= 0) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
