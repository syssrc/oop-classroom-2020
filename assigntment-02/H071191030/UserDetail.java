/**
 * UserDetail
 */
public class UserDetail {

    private Integer id;
    private String name;
    private String dateOfBirth;
    private String email;

    public UserDetail(Integer id, String name, String dateOfBirth, String email){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getEmail(){
        return this.email;
    }
}