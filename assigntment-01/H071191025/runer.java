import java.util.*;

public class runer {

  public static void main(String[] args) {
    Map<String, String> facultyMap = new HashMap<>();
    Map<String, String> majorMap = new HashMap<>();
    facultyMap.put("Nama Fakultas Lain", "A");
    facultyMap.put("Nama Fakultas Lain", "B");
    facultyMap.put("Nama Fakultas Lain", "C");
    facultyMap.put("Nama Fakultas Lain", "D");
    facultyMap.put("Nama Fakultas Lain", "E");
    facultyMap.put("Nama Fakultas Lain", "F");
    facultyMap.put("Nama Fakultas Lain", "G");
    facultyMap.put("MIPA", "H");
    majorMap.put("Prodi Lain", "01");
    majorMap.put("Prodi Lain", "02");
    majorMap.put("Prodi Lain", "03");
    majorMap.put("Prodi Lain", "04");
    majorMap.put("Prodi Lain", "05");
    majorMap.put("Prodi Lain", "06");
    majorMap.put("Ilmu Komputer", "07");

    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    student1.setFirstname ("mUHammAd");
    student1.setLastname ("fITRAH");
    student1.setRegisterYear(2017);
    student1.setFaculty("MIPA");
    student1.setDepartemen ("Matematika");
    student1.setMajor("Ilmu Komputer");
    student1.setId(facultyMap, majorMap);
    student1.setEmail(facultyMap);

    student2.setFirstname ("KENNEDY");
    student2.setLastname ("");
    student2.setRegisterYear(2017);
    student2.setFaculty("MIPA");
    student2.setDepartemen ("Matematika");
    student2.setMajor("Ilmu Komputer");
    student2.setId(facultyMap, majorMap);
    student2.setEmail(facultyMap);

    student3.setFirstname("Khawaritzmi");
    student3.setLastname("abdallah ahmad");
    student3.setRegisterYear(2017);
    student3.setFaculty("MIPA");
    student3.setDepartemen("Matematika");
    student3.setMajor("Ilmu Komputer");
    student3.setId(facultyMap, majorMap);
    student3.setEmail(facultyMap);

    student1.desc();;
    student2.desc();;
    student3.desc();;

  }
} 