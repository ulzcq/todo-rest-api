package com.example.resttodo.dto;

import com.example.resttodo.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
  private String id;
  private String title;
  private boolean done;

  public TodoDTO(final TodoEntity entity) { //왜 final??
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.done = entity.isDone();
  }

  public static TodoEntity toEntity(final TodoDTO dto) {
    return TodoEntity.builder()
        .id(dto.getId())
        .title(dto.getTitle())
        .done(dto.isDone())
        .build();
  }

}
