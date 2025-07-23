package in.ex.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ex.Student.Entity.StudentData;

public interface StudentRespository extends JpaRepository<StudentData,Integer> {

	List<StudentData> findByNameAndPassword(String name, String password);

}
