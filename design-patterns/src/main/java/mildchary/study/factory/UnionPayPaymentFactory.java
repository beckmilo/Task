package mildchary.study.factory;

/**
 * @author by mildchary
 * @description 银联支付工厂
 * @time 2020/2/24 19:58
 */
public class UnionPayPaymentFactory implements PaymentFactory {
    @Override
    public Payment create() {
        return new UnionPayPayment();
    }
}
