package util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "datetime(0) comment '생성일'")
    private LocalDateTime createDate;
    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "datetime(0) comment '수정일'")
    private LocalDateTime updateDate;
}