package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 支付宝支付工厂
 * @time 2020/2/24 19:57
 */
public class AlipayPaymentFactory implements PaymentFactory {
    @Override
    public Payment create() {
        return new AlipayPayment();
    }
}
