package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 支付宝支付
 * @time 2020/2/24 19:47
 */
public class AlipayPayment implements Payment {
    @Override
    public void beforePay() {
        System.out.println("支付宝支付前置处理");
    }

    @Override
    public void doPay() {
        beforePay();
        System.out.println("进行支付宝支付");
        afterPay();
    }

    @Override
    public void afterPay() {
        System.out.println("支付宝支付后置处理");
    }
}
