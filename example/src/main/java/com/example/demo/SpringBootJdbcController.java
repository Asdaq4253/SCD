package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringBootJdbcController {
@Autowired
JdbcTemplate h2;
@RequestMapping("/insert")
public String index(){
h2.execute("insert into STUDENT(ID,NAME,EMAIL,COURSE,PHONE_NUMBER)values(1,'Sharib','k213895','SCD',12)");
return"data inserted Successfully";
}
}