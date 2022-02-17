package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST : 빠른 배송
 * NORMAL : 보통 배송
 * SLOW : 느린 배송
 */
@Data
@AllArgsConstructor // 어노테이션은 모든 필드 값을 파라미터로 받는 생성자를 만들어줍니다.
public class DeliveryCode {

    private String code;
    private String displayName;
}
