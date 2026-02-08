package com.example.vcsop.shared.rest;

public record BaseResponse<T>(
    boolean success,
    T result,
    String message
) {
    public static <T> BaseResponse<T> success(T result) {
        return new BaseResponse<>(true, result, null);
    }

    public static <T> BaseResponse<T> error(String message) {
        return new BaseResponse<>(false, null, message);
    }
}
