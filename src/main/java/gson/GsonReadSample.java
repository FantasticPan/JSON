package gson;

import bean.StudentWithBirthday;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import json.ReadJsonSample;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by FantasticPan on 2018/3/4.
 */
public class GsonReadSample {

    public static void main(String[] args) throws IOException {
        File file = new File(ReadJsonSample.class.getResource("/wangxiaoer.json").getFile());
        String content = FileUtils.readFileToString(file);
        //Gson gson = new Gson();
        //Student student = gson.fromJson(content,Student.class);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        StudentWithBirthday student = gson.fromJson(content,StudentWithBirthday.class);
        System.out.println(student.getBirthday().toLocaleString());
    }
}
