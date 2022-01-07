package io.github.tiagosouza.studentjavaapi.service.util.upload;

import io.github.tiagosouza.studentjavaapi.model.student.Student;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHelperStudentUtil {

    public static String TYPE = "text/plain";

    public static boolean hasTXTFormat(MultipartFile file) {
        return TYPE.equals(file.getContentType());
    }

    public static List<Student> txtToData(MultipartFile file) {

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(file.getInputStream()));

            List<String[]> listStudents = new ArrayList<>();
            List<Student> students = new ArrayList<>();

            String line;

            while ((line = reader.readLine()) != null) {

                if(!line.contains("nome") && !line.isEmpty() && !line.isBlank()){
                    String[] arrayStudents = Arrays.stream(line.split("\\s+"))
                            .toArray(String[]::new);
                    listStudents.add(arrayStudents);
                }
            }

            listStudents.forEach(x -> {
                Student student = new Student();
                student.setName(x[0]);
                student.setYearsOld(Integer.valueOf(x[1]));
                student.setClassroom(x[2]);
                student.setSchoolGrades(Double.valueOf(x[3]));
                students.add(student);
            });

            return students;

        } catch (Exception e) {
            throw new RuntimeException("Fail to parse TXT file: " + e.getMessage());
        }

    }
}
