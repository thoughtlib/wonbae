package util;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseData<T> {
    private String message;
    private int errorNo;
    private T data;
}