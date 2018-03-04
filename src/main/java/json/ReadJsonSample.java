package json;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by FantasticPan on 2018/3/4.
 * 文件读取json
 */
public class ReadJsonSample {

    public static void main(String[] args) throws IOException {
        File file = new File(ReadJsonSample.class.getResource("/wangxiaoer.json").getFile());
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);

        /**
         * isNull方法判断是否为空
         */
        if (!jsonObject.isNull("name")) {
            System.out.println("姓名是："+jsonObject.getString("name"));
        }
        if (!jsonObject.isNull("nickname")) {
            System.out.println("姓名是："+jsonObject.getString("name"));
        }

        //获取json中的数组
        JSONArray majorArray = jsonObject.getJSONArray("major");
        for (int i = 0;i<majorArray.length();i++) {

            String m = (String) majorArray.get(i);
        }
    }
}
