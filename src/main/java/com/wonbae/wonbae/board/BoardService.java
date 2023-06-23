package com.wonbae.wonbae.board;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wonbae.wonbae.board.dto.BoardDTO;
import com.wonbae.wonbae.board.entity.Board;
import com.wonbae.wonbae.board.mapper.BoardMapper;
import com.wonbae.wonbae.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;
import util.CodeInfo;
import util.ResponseData;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;
    private final ObjectMapper mapper;
    
    @Transactional(readOnly = true)
    public ResponseData<Object> getList() {
        List<BoardDTO> results = boardMapper.entityListToDtoList(boardRepository.findAll());

        return ResponseData.builder()
                .errorNo(CodeInfo.ErrorCode.OK)
                .message(CodeInfo.ResponseMessage.OK)
                .data(results)
                .build();
    }

    @Transactional
    public ResponseData<Object> create(HttpServletRequest request, String jsonData) {
        try {
            // json데이터가 BoardDTO 하나만이 아닌경우
            // IntegrationDTO dto = mapper.readValue(jsonData,IntegrationDTO.class)
            BoardDTO boardDTO = mapper.readValue(jsonData, BoardDTO.class);
            boardRepository.save(boardMapper.dtoToEntity(boardDTO));

            return ResponseData.builder()
            .errorNo(CodeInfo.ErrorCode.OK)
            .message(CodeInfo.ResponseMessage.OK)
            .build();

        } catch (Exception e) {
            return ResponseData.builder()
                    .errorNo(CodeInfo.ErrorCode.WRONG_VALUE)
                    .message(CodeInfo.ResponseMessage.WRONG_VALUE)
                    .build();
                    
        }
    }

    @Transactional
    public ResponseData<Object> update(HttpServletRequest request, String jsonData) {
        try {
            BoardDTO boardDTO = mapper.readValue(jsonData, BoardDTO.class);
            Board board = boardRepository.findById(boardDTO.getId()).get();

            board.setTitle(boardDTO.getTitle());
            board.setContent(boardDTO.getContent());

            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Transactional
    public ResponseData<Object> disableBoard() {
        return null;
    }

    @Transactional
    public ResponseData<Object> delete(Integer id) {
        try {
            Board board = boardRepository.findById(id).orElseThrow();
            board.deleteStat();
            boardRepository.save(board);

            return ResponseData.builder()
                    .errorNo(CodeInfo.ErrorCode.OK)
                    .message(CodeInfo.ResponseMessage.OK)
                    .build();
            
        } catch (Exception e) {
            return ResponseData.builder()
                    .errorNo(CodeInfo.ErrorCode.EMPTY_PARAMETER)
                    .message(CodeInfo.ResponseMessage.EMPTY_PARAMETER)
                    .build();
        }
    }

}
