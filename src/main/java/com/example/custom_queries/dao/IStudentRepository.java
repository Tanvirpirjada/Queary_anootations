package com.example.custom_queries.dao;

import com.example.custom_queries.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Struct;
import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
  @Query(value = "select * from student_tbl where  first_name= :name",nativeQuery = true)
    public  Student findByFirstName(String name);

  @Query(value = "select * from student_tbl where first_name= :firstName and last_name = :lastName", nativeQuery = true)
  public Student findByFirstNameAndLastName(String firstName, String lastName);

  @Query(value = "select * from student_tbl where first_name= :firstName or last_name = :lastName", nativeQuery = true)
  public Student  findByFirstNameOrLastName(String firstName, String lastName);

  @Query(value = "select * from student_tbl where age>:age",nativeQuery = true)
  public Student findByAgeGreaterThan(Integer age);

  @Query(value = "select * from student_tbl where age>=:age",nativeQuery = true)
  public Student findByAgeGreaterThanEqual(Integer age);


  @Query(value = "select * from student_tbl where age<:age",nativeQuery = true)
  public Student findByAgeLessThan(Integer age);


  @Query(value = "select * from student_tbl where age<=:age",nativeQuery = true)
  public Student findByAgeLessThanEqual(Integer age);

@Query(value = "select * from student_tbl where first_name like '%tan%'",nativeQuery = true)
  public Student findByFirstNameLike();


  @Query(value = "select * from student_tbl where first_name not like '%tan%'",nativeQuery = true)
  public List<Student> findByFirstNameNotLike();

  @Query(value = "select * from student_tbl where first_name like 'tan%'",nativeQuery = true)
  public List<Student> findByfirstNameStartingWith();

  @Query(value = "select * from student_tbl where first_name like '%ain'",nativeQuery = true)
  public List<Student> findByfirstNameEndingWith();


  @Query(value = "select * from student_tbl where first_name like '%a%'",nativeQuery = true)
  public List<Student> findByfirstNameContaining();

  @Query(value = "select * from student_tbl where age= :age order by first_name desc ",nativeQuery = true)
  public List<Student> findByAgeOrderByFirstName(Integer age);

  @Query(value = "select * from student_tbl where first_name !='tanvir' ",nativeQuery = true)
  public List<Student> findByFirstNameNot();

//  @Query(value = "select * from student_tbl where age in ('ages')",nativeQuery = true)
//  public List<Student> findByAgeIn(List<Integer> ages);

   @Query(value = "select * from Student_tbl where active = :active",nativeQuery = true)
  public List<Student> findByActive(boolean active);
}
