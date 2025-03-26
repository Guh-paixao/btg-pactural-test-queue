package br.com.gustavo.orderms.controller.dto;

public record PaginationResponse(Integer page, Integer pageSize, Integer totalElements, Integer totalPages) {
}
