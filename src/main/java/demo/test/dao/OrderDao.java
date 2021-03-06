package demo.test.dao;

import demo.test.entity.Order;

import java.util.List;

public interface OrderDao {
    public void addOrder(Order order);

    public void updateOrder(Order order);

    public void removeOrder(int id);

    public Order getOrderById(int id);

    public List<Order> listOrders();
}
