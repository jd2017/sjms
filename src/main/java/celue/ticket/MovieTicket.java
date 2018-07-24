package celue.ticket;

public class MovieTicket {
    Discount discount;
    private double price; //电影票价格

    public MovieTicket(){
        discount = new OtherDiscount();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return discount.discount(this.price);
    }

    public void setCalculate(Discount discount) {
        this.discount = discount;
    }
}
