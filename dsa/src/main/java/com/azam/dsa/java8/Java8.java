package com.azam.dsa.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Employee{
    String name;
    String departmentName;
    
    public Employee(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", departmentName=" + departmentName + "]";
    }
    
}
public class Java8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,10,40,30,50);
        List<Integer> collect = list.stream().filter(num->num>=20&&num<=40).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect2 = list.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        System.out.println(collect2);

        List<Integer> collect3 = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.println(collect3);

        List<Employee> employees = Arrays.asList(new Employee("Azam", "IT"),
        new Employee("Amir", "IT"),
        new Employee("Reza", "TESTING"),
        new Employee("Payal", "HR"));

        Map<String, List<Employee>> collect4 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));
        collect4.forEach((departmentName,listEmployee)->{
            System.out.println(departmentName);
            listEmployee.forEach(System.out::println);
        });

        Map<String, Long> collect5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
        collect5.forEach((departmentName, counting)->{
            System.out.println(departmentName+" "+counting);
        });

        Entry<String, Long> entry = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()))
        .entrySet().stream().max(Entry.comparingByValue())
        .get();
        System.out.println(entry);

        String name = "allcccah";
        Map<String, Long> collect6 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect6); 

        List<Entry<String, Long>> collect7 = collect6.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList());
        System.out.println(collect7);

         List<Entry<String, Long>> collect8 = collect6.entrySet().stream()
        .sorted(Comparator.comparing(x->x.getValue(), Comparator.reverseOrder()))
        .collect(Collectors.toList());
        System.out.println(collect8);
    }
}
