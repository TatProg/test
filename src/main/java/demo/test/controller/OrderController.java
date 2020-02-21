package demo.test.controller;

import demo.test.entity.Order;
import demo.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
public class OrderController {

    private OrderService orderService;

    @Autowired(required = true)
    @Qualifier(value = "orderService")
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "orders", method = RequestMethod.GET)
    public String listOrders(Model model){
        model.addAttribute("order", new Order());
        model.addAttribute("listOrders", this.orderService.listOrders());

        return "orders";
    }

    @RequestMapping(value = "/orders/add", method = RequestMethod.POST)
    public String addOrder(@ModelAttribute("order") Order order){
        if(order.getOrderId() == 0){
            this.orderService.addOrder(order);
        }else {
            this.orderService.updateOrder(order);
        }

        return "redirect:/orders";
    }

    @RequestMapping("/remove/{id}")
    public String removeOrder(@PathVariable("id") int id){
        this.orderService.removeOrder(id);

        return "redirect:/orders";
    }

    @RequestMapping("edit/{id}")
    public String editOrder(@PathVariable("id") int id, Model model){
        model.addAttribute("order", this.orderService.getOrderById(id));
        model.addAttribute("listOrders", this.orderService.listOrders());

        return "orders";
    }

    @RequestMapping("orderdata/{id}")
    public String orderData(@PathVariable("id") int id, Model model){
        model.addAttribute("order", this.orderService.getOrderById(id));

        return "orderdata";
    }
}
