package bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by FantasticPan on 2018/3/4.
 */
@Setter
@Getter
public class StudentWithBirthday {

    private String name;
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String comment;
    private Date birthday;
}
