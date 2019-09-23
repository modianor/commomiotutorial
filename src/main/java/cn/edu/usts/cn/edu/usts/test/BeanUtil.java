package cn.edu.usts.cn.edu.usts.test;

import cn.edu.usts.pojo.Student;
import cn.edu.usts.pojo.Student_lombok;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class BeanUtil {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Student_lombok stu = Student_lombok.builder().id(1).stu_id(1).stu_name("tony").stu_addr("suzhou").build();
        Student stu1 = new Student(2, 3, "lucy", "wuxi");
        Student_lombok cloneStu = null;
        Student cloneStu1 = null;
        cloneStu = (Student_lombok) BeanUtils.cloneBean(stu);
        cloneStu1 = (Student) BeanUtils.cloneBean(stu1);

        System.out.println(cloneStu);
        System.out.println(cloneStu1);

    }
}
