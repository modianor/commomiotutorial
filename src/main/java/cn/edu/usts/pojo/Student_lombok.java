package cn.edu.usts.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Tolerate;

@Builder
@Getter
@Setter
@ToString
public class Student_lombok {
    private Integer id;
    private Integer stu_id;
    private String stu_name;
    private String stu_addr;

    @Tolerate

    public Student_lombok() {
    }
}
