package org.think.es.java.lang.fastjosn2;

import com.alibaba.fastjson2.annotation.JSONField;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class BasicStaff implements Serializable {
    private List<BasicStaff> boyList;

    @JSONField(format = "yyyyMMdd")
    private LocalDate localDate;

    @JSONField(format = "yyyyMMdd HH:mm:ss")
    private LocalDateTime localDateTime;

    public List<BasicStaff> getBoyList() {
        return boyList;
    }

    public void setBoyList(List<BasicStaff> boyList) {
        this.boyList = boyList;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "BasicStaff{" +
                "boyList=" + boyList +
                ", localDate=" + localDate +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
