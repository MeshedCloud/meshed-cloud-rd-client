package cn.meshed.cloud.rd.deployment.event;

import cn.meshed.cloud.dto.SecurityEvent;
import cn.meshed.cloud.rd.deployment.enums.EnvironmentEnum;
import cn.meshed.cloud.rd.deployment.enums.PublishTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class VersionPublishEvent extends SecurityEvent {

    /**
     * 发布类型
     */
    private PublishTypeEnum publishType;

    /**
     * 版本ID
     */
    private Long versionId;

    /**
     * 项目key
     */
    private String projectKey;

    /**
     * 来源ID，客户端中=仓库ID
     */
    private String sourceId;

    /**
     * 提交信息
     */
    private String message;
    /**
     * 提交信息
     */
    private EnvironmentEnum environment;

}
