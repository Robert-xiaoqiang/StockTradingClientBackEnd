package zju.se.modelandrepository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "record")
public class Record implements Serializable{
    @Column(name = "record_id")
    @Id
    private int record_id;
    @Column(name = "fund_id")
    private String fund_id;
    @Column(name = "stock_id")
    private String stock_id;
    @Column(name = "buy")
    private long buy;
    @Column(name = "amount")
    private int amount;
    @Column(name = "record_timesatmp")
    private String record_timestamp;
    @Column(name = "price")
    private double price;
    @Column(name = "state")
    private long state;

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int getRecord_id() {
        return record_id;
    }

    public long getBuy() {
        return buy;
    }

    public long getState() {
        return state;
    }

    public String getFund_id() {
        return fund_id;
    }

    public String getRecord_timestamp() {
        return record_timestamp;
    }

    public String getStock_id() {
        return stock_id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBuy(long buy) {
        this.buy = buy;
    }

    public void setFund_id(String fund_id) {
        this.fund_id = fund_id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public void setRecord_timestamp(String record_timestamp) {
        this.record_timestamp = record_timestamp;
    }

    public void setState(long state) {
        this.state = state;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

}
