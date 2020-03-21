package fii.practic.yonder.demo.service;

import com.sun.org.apache.xpath.internal.operations.String;

public interface TestService {

    java.lang.String getTestMessage();
    void save(String name);

    java.lang.String getAll();
    void update(Integer id, String newValue);

    void delete(Integer id);
}
