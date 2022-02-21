package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang="javascript" , script = "_this.price * _this.quantity >= 10000", message = "총 10000원 넘게 입력해주세요")  // @SCriptAssert는 자바 11 버전에서만 호환이 되나보다. 지금 자바는 상위 버전이기 때문에
// 오류를 범한다. HV000232: No JSR 223 script engine found for language "javascript".
public class Item {

//    @NotNull(groups = UpdateCheck.class) // 수정 요구사항 추가
    private Long id;

//    @NotBlank(groups = {SaveCheck.class , UpdateCheck.class})
    private String itemName;

//    @NotNull(groups = {SaveCheck.class , UpdateCheck.class})
//    @Range(min = 1000 , max = 1000000 , groups = {SaveCheck.class , UpdateCheck.class})
    private Integer price;

//    @NotNull(groups = {SaveCheck.class , UpdateCheck.class})
//    @Max(value = 9999 , groups = SaveCheck.class) // 수정 요구 사항 추가
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
