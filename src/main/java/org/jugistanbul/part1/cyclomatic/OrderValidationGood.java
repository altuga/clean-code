package org.jugistanbul.part1.cyclomatic;

public class OrderValidationGood {

    // Refactored version
    public boolean isOrderValid(Order order) {
        if (order == null || order.getItems() == null || order.getItems().isEmpty()) {
            return false;
        }

        for (OrderItem item : order.getItems()) {
            if (item.getQuantity() <= 0) {
                return false;
            }
        }

        return true;
    }

}
