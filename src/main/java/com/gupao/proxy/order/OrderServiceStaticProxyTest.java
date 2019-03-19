package com.gupao.proxy.order;

public class OrderServiceStaticProxyTest {
    public static void main(String[] args) {
        IOrderService service = new OrderService();
        service.insert(new Order());
    }
}
