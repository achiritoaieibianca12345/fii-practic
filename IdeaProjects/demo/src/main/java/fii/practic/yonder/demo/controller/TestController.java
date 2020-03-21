package fii.practic.yonder.demo.controller;
import com.sun.org.apache.xpath.internal.operations.String;
import fii.practic.yonder.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class TestController {
    //http://localhost:8080/test?name=fiipractic
    //http://localhost:8080/test/1?name=fiipractic
    @Autowired
    private TestService testService;//=new TestServiceImpl(x,y,z);
    @GetMapping
    @RequestMapping(value = "/test")
    public java.lang.String getTestMessage() {
        return testService.getTestMessage();
    }
    @GetMapping
    public java.lang.String getNames(){
        return testService.getAll();
    }
    @PostMapping
    public void save(@RequestBody String name)
    {
        testService.save(name);
    }
    @PutMapping(value="/{id}")
    public void update(@PathVariable Integer id, @RequestBody String newValue)
    {
        testService.update(id, newValue);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
    }
}
