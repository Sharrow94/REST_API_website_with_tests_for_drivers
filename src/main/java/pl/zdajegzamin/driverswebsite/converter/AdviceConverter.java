package pl.zdajegzamin.driverswebsite.converter;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.zdajegzamin.driverswebsite.dto.AdviceDTO;
import pl.zdajegzamin.driverswebsite.entity.Advice;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdviceConverter {

    public AdviceDTO entityToDto(Advice advice){
        ModelMapper mapper=new ModelMapper();
        return mapper.map(advice,AdviceDTO.class);
    }

    public  Advice dtoToEntity(AdviceDTO adviceDTO){
        ModelMapper mapper=new ModelMapper();
        return mapper.map(adviceDTO,Advice.class);
    }

    public List<AdviceDTO> entityToDto(List<Advice>adviceList){
         return adviceList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Advice> dtoToEntity(List<AdviceDTO>adviceDTOList){
        return adviceDTOList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
