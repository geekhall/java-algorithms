package cn.geekhall.algorithms.basic.comparator;

import cn.geekhall.cn.geekhall.bean.Student;

/**
 * IdComparator.java
 *
 * @author yiny
 */
public class IdComparator {
    private Order order;
    public IdComparator(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int compare(Student t1, Student t2) {
        int id1 = Integer.parseInt(t1.getId());
        int id2 = Integer.parseInt(t2.getId());
        if (order == Order.ASC) {
            return id1 - id2;
        } else {
            return id2 - id1;
        }
    }
}
