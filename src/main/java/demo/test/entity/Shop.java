package demo.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @Column(name = "shopID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;

    @Column(name = "companyFullName")
    private String name;

    public Shop(int shopId, String name) {
        this.shopId = shopId;
        this.name = name;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", name='" + name + '\'' +
                '}';
    }
}
