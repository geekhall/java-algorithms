package cn.geekhall.algorithms.basic.comparator;

import cn.geekhall.cn.geekhall.bean.Student;

import java.util.Comparator;

/**
 * IdAscComparator.java
 *
 * @author yiny
 */
public class IdAscComparator extends IdComparator implements Comparator<Student> {
    public IdAscComparator() {
        super(Order.ASC);
    }

    @Override
    public int compare(Student t1, Student t2) {
        return super.compare(t1, t2);
    }
}
