package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 银联支付
 * @time 2020/2/24 19:49
 */
public class UnionPayPayment implements Payment {
    @Override
    public void beforePay() {
        System.out.println("银联支付前置处理");
    }

    @Override
    public void doPay() {
        beforePay();
        System.out.println("进行银联支付");
        afterPay();
    }

    @Override
    public void afterPay() {
        System.out.println("银联支付后置处理");
    }
}
