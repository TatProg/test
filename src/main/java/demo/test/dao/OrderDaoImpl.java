package demo.test.dao;

import demo.test.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

public class OrderDaoImpl implements OrderDao{
    private static final Logger logger = LoggerFactory.getLogger(OrderDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addOrder(Order order) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(order);
        logger.info("Order successfully saved. Order details: " + order);
    }

    @Override
    public void updateOrder(Order order) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(order);
        logger.info("Order successfully update. Order details: " + order);
    }

    @Override
    public void removeOrder(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Order order = (Order) session.load(Order.class, new Integer(id));

        if(order!=null){
            session.delete(order);
        }
        logger.info("Order successfully removed. Order details: " + order);
    }

    @Override
    public Order getOrderById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Order order = (Order) session.load(Order.class, new Integer(id));
        logger.info("Order successfully loaded. Order details: " + order);

        return order;
    }

    //@Override
    @SuppressWarnings("unchecked")
    public List<Order> listOrders() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Order> orderList = session.createQuery("from Order").list();

        for(Order order: orderList){
            logger.info("Order list: " + order);
        }

        return orderList;
    }
}
