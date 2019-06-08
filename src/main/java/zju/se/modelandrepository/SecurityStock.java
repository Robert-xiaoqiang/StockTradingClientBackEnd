package zju.se.modelandrepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "security_stock")
public class SecurityStock implements Serializable {
    private final static long serialVersionID = 1l;
    @Column(name = "id")
    @Id
    private long Id;

    @Column(name = "security_id", nullable = false)
    private String securityId;

    @Column(name = "stock_id", nullable = false)
    private String stockId;

    @Column(name = "ava_price")
    private double avaPrice;

    @Column(name = "num")
    private long num;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public double getAvaPrice() {
        return avaPrice;
    }

    public void setAvaPrice(double avaPrice) {
        this.avaPrice = avaPrice;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }
}
