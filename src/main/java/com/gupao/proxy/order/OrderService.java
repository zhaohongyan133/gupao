package com.gupao.proxy.order;

public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService() {
        this.orderDao = new OrderDao();
    }

    @Override
    public int insert(Order order) {
        before();
        String source = "mysql";
        DynamicDataSourceEntry.set(source);
        System.out.println("source name : " + source);
        System.out.println("OrderService调用OrderDao创建订单");
        after();
        return orderDao.insert();
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
