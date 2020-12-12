package io.tangtian.springbean.springbean07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tangtian
 * @version 1.0
 * @className User7_1
 * @description
 * @date 2020/11/16 9:00 AM
 **/
public class User7_4 {
    private static final Logger LOG = LoggerFactory.getLogger(User7_4.class);
    private int id;
    private String name;

    public User7_4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
