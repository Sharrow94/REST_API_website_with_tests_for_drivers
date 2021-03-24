package pl.zdajegzamin.driverswebsite.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int points;
    @ManyToOne
    private User user;
    @ManyToOne
    private Quiz quiz;
}
