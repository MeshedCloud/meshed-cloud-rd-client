package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>制品类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum PackagesTypeEnum {
    /**
     * 制品库
     */
    MAVEN(1, "maven"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
