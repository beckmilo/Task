package mildchary.study.factory;

/**
 * @author by mildchary
 * @description 微信支付
 * @time 2020/2/24 19:48
 */
public class WeChatPayment implements Payment {
    @Override
    public void beforePay() {
        System.out.println("微信支付前置处理");
    }

    @Override
    public void doPay() {
        beforePay();
        System.out.println("进行微信支付");
        afterPay();
    }

    @Override
    public void afterPay() {
        System.out.println("微信支付后置处理");
    }
}
