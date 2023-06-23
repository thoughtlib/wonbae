package com.wonbae.wonbae.board.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.wonbae.wonbae.board.dto.BoardDTO;
import com.wonbae.wonbae.board.entity.Board;

/* 
 * Mapstruct
 * 
 * gradle.build
 * implementation 'org.mapstruct:mapstruct:1.5.3.Final'
 * annotationProcessor 'org.mapstruct:mapstruct-processor:1.5.3.Final'
 * 
 * 컴파일 시점에 코드를 생성하여 런타임에서 안정성을 보장합니다.
 * 다른 매핑 라이브러리보다 속도가 빠릅니다.
 * 반복되는 객체 매핑에서 발생할 수 있는 오류를 줄일 수 있으며, 구현 코드를 자동으로 만들어주기 때문에 사용이 쉽습니다.
 * Annotation processor를 이용하여 객체 간 매핑을 자동으로 제공합니다.
 * 다만, Lombok 라이브러리에 먼저 dependency (의존성) 추가가 되어있어야 합니다. 
 * MapStruct는 Lombok의 getter, setter, builder를 이용하여 생성되므로 Lombok 보다 먼저 의존성이 선언된 경우 실행할 수 없습니다.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardMapper {
    BoardDTO entityToDto(Board board);
    Board dtoToEntity(BoardDTO boardDTO);
    List<BoardDTO> entityListToDtoList(List<Board> boardList);
    List<Board> dtoListToEntityList(List<BoardDTO> boardDTOLIst);
}
