package com.day8.session1.threads;

package Test1prep;



import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;



class Employee1 implements Comparable<Employee1> {
private int id;
private String name;
private String city;
private double salary;



public Employee1(int id, String name, String city, double salary) {
this.id = id;
this.name = name;
this.city = city;
this.salary = salary;
}



public int getId() {
return this.id;
}





@Override
public String toString() {
StringBuilder builder = new StringBuilder();
builder.append("Employee1 [id=").append(id).append(", name=").append(name).append(", city=").append(city)
.append(", salary=").append(salary).append("]");
return builder.toString();
}



@Override
public int compareTo(Employee1 o) {



return this.name.compareTo(o.name);
}



}



class employeeComparator implements Comparator<Employee1> {



@Override
public int compare(Employee1 arg0, Employee1 arg1) {
// TODO Auto-generated method stub
return arg0.getId() - arg1.getId();
}



}



public class demo {
public static void main(String[] args) {



List<Employee1> list = new ArrayList<>();



File file=new File("saurabh.txt");
BufferedReader br;

try {
br = new BufferedReader(new FileReader(file));
String s = null;
while ((s = br.readLine()) != null) {
String str[] = s.split(":");
Employee1 e = new Employee1(Integer.parseInt(str[0]), str[1], str[2], Double.parseDouble(str[3]));
list.add(e);}
} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch(IOException e2) {
e2.printStackTrace();
}

Collections.sort(list);
System.out.println(list);



}
}