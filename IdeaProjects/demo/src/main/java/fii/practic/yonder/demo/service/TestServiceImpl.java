package fii.practic.yonder.demo.service;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    private Map<Integer, String> map = new HashMap<>();
    private Integer id = 0;

    @Override
    public java.lang.String getTestMessage() {
        return "Hello from Service layer";
    }

    @Override
    public void save(String name) {
        map.put(id, name);
        id++;
    }

    public java.lang.String getAll() {
        return map.toString();
    }

    @Override
    public void update(Integer id, String newValue) {
        map.put(id, newValue);
    }

    @DeleteMapping
    public void delete(Integer id) {
        map.remove(id);
    }
}
