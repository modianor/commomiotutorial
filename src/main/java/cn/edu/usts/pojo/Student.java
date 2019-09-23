package cn.edu.usts.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

public class Student {
    private Integer id;
    private Integer stu_id;
    private String stu_name;
    private String stu_addr;

    public Student() {
    }

    public Student(Integer id, Integer stu_id, String stu_name, String stu_addr) {
        this.id = id;
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_addr = stu_addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_addr() {
        return stu_addr;
    }

    public void setStu_addr(String stu_addr) {
        this.stu_addr = stu_addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_addr='" + stu_addr + '\'' +
                '}';
    }
}
