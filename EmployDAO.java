package com.infinite.JsfJdbc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable {
	
	public List<Employ>  showEmploy(){
	List<Employ> employList = new ArrayList<Employ>();
	employList.add(new Employ(1, "Gaurav", "Java","Developer",87435));
	employList.add(new Employ(2, "Harshit", "J2EE","Expert",87435));
	employList.add(new Employ(3, "Swathi", "MySql","Programmer",87336));
	employList.add(new Employ(4, "Abhishek", "Angular","Tester",82332));
	employList.add(new Employ(5, "Sirisha", "React","Manager",89878));
	return employList;
}
}
