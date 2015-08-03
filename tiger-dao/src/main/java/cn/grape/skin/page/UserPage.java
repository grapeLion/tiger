package cn.grape.skin.page;

import cn.grape.skin.domain.User;

import java.util.List;

/**
 * Created by Emily on 15/8/3.
 */
public class UserPage {
    private int total;
    private List<User> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<User> getRows() {
        return rows;
    }

    public void setRows(List<User> rows) {
        this.rows = rows;
    }
}
