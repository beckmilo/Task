package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 跨境支付
 * @time 2020/2/24 19:45
 */
public class CrossBorderPayment implements Payment {
    @Override
    public void beforePay() {
        System.out.println("跨境支付前置处理");
    }

    @Override
    public void doPay() {
        beforePay();
        System.out.println("进行跨境支付");
        afterPay();
    }

    @Override
    public void afterPay() {
        System.out.println("跨境支付后置处理");
    }
}
