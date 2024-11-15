package com.ict.edu2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DataVO<T> {
    private int resultCode;
    private String message;
    private T data;

    public static <T> DataVO<T> success(T data) {
        return new DataVO<>(1, "OK", data);
    }

    public static <T> DataVO<T> success(T data, String msg) {
        return new DataVO<>(1, msg, data);
    }

    public static <T> DataVO<T> success(int resultCode, String message, T data) {
        return new DataVO<>(resultCode, message, data);
    }

    public static DataVO<?> fail(int resultCode, String message) {
        return new DataVO<>(resultCode, message, null);
    }

    public static <T> DataVO<T> fail(int resultCode, String message, T data) {
        return new DataVO<>(resultCode, message, data);
    }
}
