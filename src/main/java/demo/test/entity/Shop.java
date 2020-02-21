package demo.test.entity;

public class Shop {
    private int shopId;
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
}
