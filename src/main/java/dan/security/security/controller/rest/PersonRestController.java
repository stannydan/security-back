package dan.security.security.controller.rest;

import dan.security.security.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonRestController {
    private List<Person> list= new ArrayList<>(
            Arrays.asList(
                    new Person("1","Petya",19),
                    new Person("2","Vasya",23),
                    new Person("3","Dasha",20)
            )
    );

    @RequestMapping("/list")
    public List<Person> showAll(){
        return list;
    }


}
