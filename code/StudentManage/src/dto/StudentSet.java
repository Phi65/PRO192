/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Iterator;
import java.util.TreeSet;
import mylib.Validation;

/**
 *
 * @author Razer Blade
 */
public class StudentSet {
   private  TreeSet<Student> t;
   public StudentSet(){
       t=new TreeSet<>();
   }
   public boolean addStudent(Student stu){
       return t.add(stu);
   }
   public void displayAll(){
//        for (Student student : t) {
//           student.outputStudent();
//       }
        Iterator<Student> it=t.descendingIterator();
        while (it.hasNext()){
            Student stu=it.next();
            stu.outputStudent();
        }
   }
   public Student findStudent(int id){
       for (Student student : t) {
           if (student.getId()==id) return student;
       }
       return null;
   }
   public boolean updateStudent(int id){
       Student rs=findStudent(id);
       if (rs==null) return false;
       try{
           String newname=Validation.inputString("Input new name");
           rs.setName(newname);
       }catch(Exception e){
           System.out.println("error");
       }
       return true;
   }
   public Student removeStudent(int id){
       Student rs=findStudent(id);
       if (rs==null) return null;
       t.remove(rs);
       return rs;
   }
}
