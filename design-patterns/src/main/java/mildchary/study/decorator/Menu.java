package mildchary.study.decorator;

/**
 * @author by mildchary
 * @description 菜单实体
 * @time 2020/3/5 15:18
 */
public class Menu {
    private String name;
    private String uri;

    public Menu(String name, String uri) {
        this.name = name;
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
