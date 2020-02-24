package mildchary.study.factorypattern;

/**
 * @author by mildchary
 * @description 支付顶层接口
 * @time 2020/2/24 19:42
 */
public interface Payment {

    /**
     * 支付前操作
     */
    void beforePay();

    /**
     * 支付操作
     */
    void doPay();

    /**
     * 支付后操作
     */
    void afterPay();
}
