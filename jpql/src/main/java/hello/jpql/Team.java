package hello.jpql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team {

    @Id @GeneratedValue
    @Column(name = "team_id")
    private Long id;

    private String username;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

}
