package ch17.sec03;

import java.util.List;

public class StreamPipeLineExcample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 10),
                new Student("김길동", 20),
                new Student("서길동", 30)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average().getAsDouble();

        int tot = list.stream()
                .mapToInt(student -> student.getScore())
                .sum();

        int max = list.stream().mapToInt(student -> student.getScore()).max().getAsInt();

        System.out.println("평균점수 :: " + avg);
        System.out.println("총점수 :: " + tot);
        System.out.println("최고점수 :: " + max);

        list.stream().map(student->student.getName()).forEach(name->System.out.println(name));
    }
}
