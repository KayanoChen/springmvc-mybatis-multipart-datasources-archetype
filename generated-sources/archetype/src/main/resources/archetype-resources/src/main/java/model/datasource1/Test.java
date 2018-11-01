#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.datasource1;

/**
 * @ProjectName: kayanochen
 * @Package: ${package}.model.datasource0
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
                ", name='" + name + '${symbol_escape}'' +
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
