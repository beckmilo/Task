package mildchary.study.decorator;

import java.util.List;

/**
 * @author by mildchary
 * @description GPer社区未登录状态下的导航条
 * @time 2020/3/5 14:58
 */
public class NavigationBarDecorator implements NavigationBar {

    private NavigationBar navigationBar;

    public NavigationBarDecorator(NavigationBar navigationBar) {
        this.navigationBar = navigationBar;
    }

    @Override
    public List<Menu> getMenus() {
        return navigationBar.getMenus();
    }
}
