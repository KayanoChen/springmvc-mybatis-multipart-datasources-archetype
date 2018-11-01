package it.pkg.model.datasource0;

/**
 * @ProjectName: kayanochen
 * @Package: it.pkg.model.datasource0
 * @Description:
 * @Author: ylkj
 * @CreateDate: 16:14 2018/10/31
 * @Version: 1.0
 */
public class Test {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
