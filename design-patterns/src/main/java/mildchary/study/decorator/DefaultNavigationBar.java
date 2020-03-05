package mildchary.study.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by mildchary
 * @description GPer社区未登录状态下的导航条
 * @time 2020/3/5 15:06
 */
public class DefaultNavigationBar implements NavigationBar {


    @Override
    public List<Menu> getMenus() {
        List<Menu> menus = new ArrayList<>();
        menus.addAll(Arrays.asList(new Menu("问答", "/index"),
                new Menu("文章", "/article"),
                new Menu("精品课", "/resources"),
                new Menu("冒泡", "/bubblings"),
                new Menu("商城", "/shop")
        ));
        return menus;
    }
}
