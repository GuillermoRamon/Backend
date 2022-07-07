package data;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private int noteBooks;
    private List<String> activities = new ArrayList<>();

}