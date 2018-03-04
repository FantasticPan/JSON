package gson;

import bean.Student;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

/**
 * Created by FantasticPan on 2018/3/4.
 */
public class GsonCreateSample {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("王小二");
        student.setAge(25.2);
        student.setBirthday("1990-01-01");
        student.setSchool("蓝翔");
        student.setMajor(new String[]{"理发", "挖掘机"});
        student.setHas_girlfriend(false);
        student.setCar(null);
        student.setHouse(null);
        student.setComment("这是一个注释");
        student.setIgnore("不要看见我");

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            public String translateName(Field field) {
                if (field.getName().equals("name")) {
                    return "NAME";
                }
                return field.getName();
            }
        });
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(student));
    }
}
