import java.time.LocalDateTime;

@JsonName(value = "super_man")
public class SuperMan {
    // khong chu thich, thi se coi nhu lay ten field la name luon
    private String name;
    @JsonName("date_of_birth")
    private LocalDateTime dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
