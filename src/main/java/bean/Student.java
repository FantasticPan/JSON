package bean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by FantasticPan on 2018/3/4.
 */
@Getter
@Setter
public class Student {

    //@SerializedName("NAME")
    private String name;
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String comment;
    private String birthday;

    // 生成过程中忽略
    private transient String ignore;
}
