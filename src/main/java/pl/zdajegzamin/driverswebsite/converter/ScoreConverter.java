package pl.zdajegzamin.driverswebsite.converter;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.zdajegzamin.driverswebsite.dto.ScoreDTO;
import pl.zdajegzamin.driverswebsite.entity.Score;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ScoreConverter {

    public ScoreDTO entityToDto(Score score){
        ModelMapper mapper=new ModelMapper();
        return mapper.map(score,ScoreDTO.class);
    }

    public Score dtoToEntity(ScoreDTO scoreDTO){
        ModelMapper mapper=new ModelMapper();
        return mapper.map(scoreDTO,Score.class);
    }

    public List<ScoreDTO> entityToDto(List<Score> scores){
        return scores.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Score> dtoToEntity(List<ScoreDTO>scoreDTOList){
        return scoreDTOList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
