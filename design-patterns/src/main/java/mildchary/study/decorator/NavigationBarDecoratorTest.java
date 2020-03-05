package mildchary.study.decorator;

/**
 * @author by mildchary
 * @description 使用装饰器模式实现一个可根据权限动态扩展功能的导航条测试
 * @time 2020/3/5 15:28
 */
public class NavigationBarDecoratorTest {
    public static void main(String[] args) {
        NavigationBar navigationBar = new DefaultNavigationBar();
        navigationBar = new LoginNavigationBarDecorator(navigationBar);
        navigationBar = new TeacherNavigationBarDecorator(navigationBar);
        navigationBar.getMenus().forEach(System.out::println);
    }
}
