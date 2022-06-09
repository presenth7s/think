package org.think.es.java.lang.fastjosn2;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class FastjsonTest {
    private static BasicStaff prepare() {
        BasicStaff staff = new BasicStaff();
        staff.setLocalDate(LocalDate.now());
        staff.setLocalDateTime(LocalDateTime.now());

        List<BasicStaff> list = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            BasicStaff staffI = new BasicStaff();

            staffI.setLocalDate(LocalDate.now());
            staffI.setLocalDateTime(LocalDateTime.now());

            list.add(staffI);
        }
        //  嵌套同样类型的bean，就会导致OOM
        staff.setBoyList(list);

        return staff;
    }

    public static void main(String[] args) {
        BasicStaff staff = prepare();

        // 序列化
        String jsonString = JSON.toJSONString(staff, JSONWriter.Feature.WriteClassName);
        System.out.println(jsonString);

        // 反序列化（就在这出的问题）
        BasicStaff staffD = (BasicStaff) JSON.parseObject(jsonString, Object.class, JSONReader.Feature.SupportAutoType);
        System.out.println(staffD);
    }
}
