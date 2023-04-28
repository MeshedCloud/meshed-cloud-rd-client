package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>版本状态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum VersionStatusEnum {
    /**
     * 版本提交信息
     */
    SUBMIT(1, "submit"),
    /**
     * 代码构建中（开始构建）
     */
    BUILDING(2, "building"),
    /**
     * 代码构建（已推送仓库中）
     */
    BUILD(3, "build"),
    /**
     * 已经发布
     */
    PUBLISHED(4, "published"),
    /**
     * 代码构建失败
     */
    BUILD_FAILED(5, "build_failed"),
    /**
     * 部署失败
     */
    DEPLOYMENT_FAILED(6, "deployment_failed"),
    /**
     * 拒绝
     */
    REJECT(7, "reject"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
