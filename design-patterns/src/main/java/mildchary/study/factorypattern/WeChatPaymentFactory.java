package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 微信支付工厂
 * @time 2020/2/24 19:59
 */
public class WeChatPaymentFactory implements PaymentFactory {
    @Override
    public Payment create() {
        return new WeChatPayment();
    }
}
