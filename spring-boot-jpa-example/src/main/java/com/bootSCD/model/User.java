package com.bootSCD.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userdata")
public class User 
{
@Id
private int id;
private String username;
private String course;
private String gpa;
private String name;
public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getUname() 
{
return username;
}
public void setUname(String username) 
{
this.username = username;
}
public String getcourse() 
{
return course;
}
public void setcourse(String course) 
{
this.course = course;
}public String getgpa() 
{
return gpa;
}
public void setgpa(String gpa) 
{
this.gpa = gpa;
}public String getname() 
{
return name;
}
public void setname(String name) 
{
this.name = name;
}
@Override
public String toString() 
{
return "User [id=" + id + ", uname=" + username + ",course=" + course + ", gpa=" + gpa + ",name=" + name +"]";
}
}
