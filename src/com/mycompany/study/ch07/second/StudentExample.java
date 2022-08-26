package com.mycompany.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		// 명시적 생성자를 사용하여 객체를 생성하고
		// 모든 필드를 출력하시오
		Student student = new Student("김덕철","2341234-2342344", 17);
		System.out.println(student.name+" / " + student.ssn + " / " + student.studentNo);
		Student student2 = new Student("김두한","234234-23423423");
		System.out.println(student2.name+" / " + student.ssn + "/ "+student2.studentNo);

	}

}
