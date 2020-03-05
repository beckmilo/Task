package mildchary.study.prototype;

        import com.alibaba.fastjson.JSON;

/**
 * @author by mildchary
 * @description 用JSON方式实现原型模式的深克隆
 * @time 2020/3/1 10:00
 */
public class PrototypeDeepCopyWithJSON<T> {
    public T deepCopy(T t){
        return (T) JSON.parseObject(JSON.toJSONString(t),t.getClass());
    }
}
