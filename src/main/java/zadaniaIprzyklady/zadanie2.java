package zadaniaIprzyklady;

import dao.OrderDao;
import model.Order;

import java.time.LocalDateTime;
import java.util.List;

public class zadanie2 {
    public static void main(String[] args) {

        OrderDao orderDao = new OrderDao();
        List<Order> orders = orderDao.findByDate(LocalDateTime.of(2020, 2,29,15,35,7));
                orders.forEach(order -> System.out.println(order.toString()));
    }
}
