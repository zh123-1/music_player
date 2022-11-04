package com.example.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {
    private int code;
    private String massage;
    private T data;

    public ResponseResult(T data) {
        this.code = 0;
        this.massage = "success";
        this.data = data;
    }
}
