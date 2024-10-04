package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import models.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbc;

	public void save(Student student) {

		String sql = "insert into student(age,name,rollNo) values(?,?,?)";
		int affected = jdbc.update(sql, student.getAge(), student.getName(), student.getRollNo());
		System.out.println("rows affected" + affected);
	}

	public List<Student> getAll() {

		String sql = "select * from student";
		org.springframework.jdbc.core.RowMapper<Student> mapper = new org.springframework.jdbc.core.RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student st = new Student();
				st.setAge(Integer.parseInt(rs.getString("age")));
				st.setName(rs.getString("name"));
				st.setRollNo(Integer.parseInt(rs.getString("rollNo")));
				return st;
			}
		};

		List<Student> students = jdbc.query(sql, mapper);
		return students;
	}

}
