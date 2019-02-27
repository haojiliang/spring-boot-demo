package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * GirlProperties
 *
 * @author hxx
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    /**
     * cupSize
     */
    private String cupSize;

    /**
     * age
     */
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
