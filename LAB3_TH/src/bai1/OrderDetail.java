package bai1;

public class OrderDetail {

    public int quantity;
    public Product product;

    public OrderDetail() {

    }

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quatity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "{"
                + " quantity='" + getQuantity() + "'"
                + ", product='" + getProduct() + "'"
                + "}";
    }

    public double calcTotalPrice() {
        return quantity * product.getPrice();
    }
}
