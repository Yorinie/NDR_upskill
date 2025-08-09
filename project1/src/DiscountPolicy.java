//1. discountpolicy

public interface DiscountPolicy {
    /*@param amount the original amount
     * @return the amount after the discount is applied
     */
    double applyDiscount(double amount);
}
