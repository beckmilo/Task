package mildchary.study.factory;

/**
 * @author by mildchary
 * @description 测试类
 * @time 2020/2/24 20:03
 */
public class PaymentTest {
    public static void main(String[] args) {
        PaymentFactory factory = new WeChatPaymentFactory();
        Payment payment = factory.create();
        payment.doPay();
    }
}
