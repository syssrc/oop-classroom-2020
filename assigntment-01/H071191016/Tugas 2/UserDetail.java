class UserDetail {
    private int id;
    private String name;
    private String dateOfBirth;
    private String email;

    public UserDetail(int id, String name, String dateOfBirth, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getEmail() {
        return email;
    }
}