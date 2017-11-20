package com.zf.springboot.manager.bean;

import com.zf.springboot.config.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * Created by zf on 2017/11/20 0020.
 */
@Repository
public class User {
    @Value(Keys.ZF_TEST_NAME)
    private String name;
    @Value(Keys.ZF_TEST_AGE)
    private Integer age;
    @Value(Keys.ZF_TEST_MAN)
    private boolean man;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", man=" + man +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
