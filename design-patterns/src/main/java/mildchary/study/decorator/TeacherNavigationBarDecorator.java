package mildchary.study.decorator;

import java.util.Arrays;
import java.util.List;

/**
 * @author by mildchary
 * @description 老师导航栏装饰器
 * @time 2020/3/5 15:42
 */
public class TeacherNavigationBarDecorator extends NavigationBarDecorator {
    public TeacherNavigationBarDecorator(NavigationBar navigationBar) {
        super(navigationBar);
    }

    @Override
    public List<Menu> getMenus() {
        List<Menu> menus = super.getMenus();
        menus.addAll(Arrays.asList(new Menu("评价", "/evaluation")));
        return menus;
    }
}
