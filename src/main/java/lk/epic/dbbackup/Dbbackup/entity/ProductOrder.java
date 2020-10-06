package lk.epic.dbbackup.Dbbackup.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "product_order", schema = "u623662090_urgent_db", catalog = "")
public class ProductOrder {
    private long id;
    private String code;
    private String buyer;
    private String address;
    private String email;
    private String shipping;
    private long dateShip;
    private String phone;
    private String comment;
    private String status;
    private BigDecimal totalFees;
    private BigDecimal tax;
    private String serial;
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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "buyer")
    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "shipping")
    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    @Basic
    @Column(name = "date_ship")
    public long getDateShip() {
        return dateShip;
    }

    public void setDateShip(long dateShip) {
        this.dateShip = dateShip;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "total_fees")
    public BigDecimal getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(BigDecimal totalFees) {
        this.totalFees = totalFees;
    }

    @Basic
    @Column(name = "tax")
    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @Basic
    @Column(name = "serial")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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
        ProductOrder that = (ProductOrder) o;
        return id == that.id &&
                dateShip == that.dateShip &&
                createdAt == that.createdAt &&
                lastUpdate == that.lastUpdate &&
                Objects.equals(code, that.code) &&
                Objects.equals(buyer, that.buyer) &&
                Objects.equals(address, that.address) &&
                Objects.equals(email, that.email) &&
                Objects.equals(shipping, that.shipping) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(status, that.status) &&
                Objects.equals(totalFees, that.totalFees) &&
                Objects.equals(tax, that.tax) &&
                Objects.equals(serial, that.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, buyer, address, email, shipping, dateShip, phone, comment, status, totalFees, tax, serial, createdAt, lastUpdate);
    }
}
