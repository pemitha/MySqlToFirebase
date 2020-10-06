package lk.epic.dbbackup.Dbbackup.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "product_order_detail", schema = "u623662090_urgent_db", catalog = "")
public class ProductOrderDetail {
    private long id;
    private long productId;
    private String productName;
    private int amount;
    private BigDecimal priceItem;
    private long createdAt;
    private long lastUpdate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "amount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "price_item")
    public BigDecimal getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(BigDecimal priceItem) {
        this.priceItem = priceItem;
    }

    @Basic
    @Column(name = "created_at")
    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "last_update")
    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOrderDetail that = (ProductOrderDetail) o;
        return id == that.id &&
                productId == that.productId &&
                amount == that.amount &&
                createdAt == that.createdAt &&
                lastUpdate == that.lastUpdate &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(priceItem, that.priceItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, productName, amount, priceItem, createdAt, lastUpdate);
    }
}
