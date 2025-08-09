/* 5. customer class
 * 
*/

public class Customer {
    private int id;
    private String name;
    private int discount;

    /*
     * constructor for create Customer object
     * 
     * @param id : customer id is unique and not negteive
     * 
     * @param name not null
     * 
     * @param discount must be between 0-100
     * 
     * @throws IllegalArgumentException if @param is wrong
     */
    public Customer(int id, String name, DiscountPolicy discountPolicy) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be non-negative.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer Name must not be null or blank.");
        }
        if (discountPolicy == null) {
            throw new IllegalArgumentException("Customer must have a discount policy");
        }

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getDiscountPolicy() {
        return this.discountPolicy;
    }

    public void setDiscount(DiscountPolicy policy) {
        if (policy == null) {
            throw new IllegalArgumentException("Customer must have a discount policy");
        }
        this.discountPolicy = policy;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name= " + name +
                ", discountPolicy= " + discountPolicy + "}";
    }
}
