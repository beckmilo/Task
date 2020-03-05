package mildchary.study.decorator;

import java.util.Arrays;
import java.util.List;

/**
 * @author by mildchary
 * @description GPer社区已登录状态下的导航条
 * @time 2020/3/5 15:06
 */
public class LoginNavigationBarDecorator extends NavigationBarDecorator {


    public LoginNavigationBarDecorator(NavigationBar navigationBar) {
        super(navigationBar);
    }

    @Override
    public List<Menu> getMenus() {
        List<Menu> menus = super.getMenus();
        menus.addAll(Arrays.asList(
                new Menu("作业", "/homework"),
                new Menu("题库", "/question-bank"),
                new Menu("成长墙", "/growth-wall")
        ));
        return menus;
    }
}
