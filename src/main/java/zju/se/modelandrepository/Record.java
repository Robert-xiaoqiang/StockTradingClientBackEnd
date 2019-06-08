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
    private String fundId;
    @Column(name = "stock_id")
    private String stockId;
    @Column(name = "buy")
    private long buy;
    @Column(name = "amount")
    private int amount;
    @Column(name = "record_timestamp")
    private String recordTimestamp;
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

    public String getFundId() {
        return fundId;
    }

    public String getRecordTimestamp() {
        return recordTimestamp;
    }

    public String getStockId() {
        return stockId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBuy(long buy) {
        this.buy = buy;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public void setRecord_timestamp(String recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
    }

    public void setState(long state) {
        this.state = state;
    }

    public void setStock_id(String stockId) {
        this.stockId = stockId;
    }

}
