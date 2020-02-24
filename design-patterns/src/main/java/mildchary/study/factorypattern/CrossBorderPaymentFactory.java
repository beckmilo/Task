package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 跨境支付工厂
 * @time 2020/2/24 19:53
 */
public class CrossBorderPaymentFactory implements PaymentFactory {
    @Override
    public Payment create() {
        return new CrossBorderPayment();
    }
}
