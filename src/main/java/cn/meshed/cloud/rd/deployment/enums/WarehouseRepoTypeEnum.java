package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>来源类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum WarehouseRepoTypeEnum {

    /**
     * 未知类型： 无法识别出仓库端
     */
    UNKNOWN(1, "unknown"),

    /**
     * 云效仓库 系统研发默认方案
     */
    CODEUP(1, "codeup.aliyun.com"),

    /**
     * github
     */
    GITHUB(2, "github.com"),
    /**
     * gitee
     */
    GITEE(2, "gitee.com"),
    /**
     * gitlab
     */
    GITLAB(2, "gitlab.com"),
    /**
     * coding
     */
    CODING(3, "coding.net"),

    ;

    @EnumValue
    private final int value;
    private final String ext;
}
