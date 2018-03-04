package json;

import bean.Student;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by FantasticPan on 2018/3/4.
 */
public class JsonObjectSample {

    public static void main(String[] args) {

        jSONObjectSample();
        createJsonByMap();
    }

    private static void jSONObjectSample() {
        JSONObject object = new JSONObject();
        Object nullObj = null;
        object.put("name", "王小二");
        object.put("age", 25.2);
        object.put("birthday", "1990-01-01");
        object.put("school", "蓝翔");
        object.put("major", new String[]{"理发", "挖掘机"});
        object.put("has_girlfriend", false);
        object.put("car", nullObj);
        object.put("house", nullObj);
        object.put("commit", "这是一个注释");
        System.out.println(object.toString());
    }

    private static void createJsonByMap() {
        Map<String,Object> object = new HashMap<String, Object>();
        Object nullObj = null;
        object.put("name", "王小二");
        object.put("age", 25.2);
        object.put("birthday", "1990-01-01");
        object.put("school", "蓝翔");
        object.put("major", new String[]{"理发", "挖掘机"});
        object.put("has_girlfriend", false);
        object.put("car", nullObj);
        object.put("house", nullObj);
        object.put("commit", "这是一个注释");
        System.out.println(new JSONObject(object).toString());
    }

    public static void createJsonByBean() {
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

        System.out.println(new JSONObject(student).toString());
    }
}
