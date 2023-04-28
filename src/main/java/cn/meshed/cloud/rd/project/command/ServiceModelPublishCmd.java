package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceModelTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务模型发布操作")
public class ServiceModelPublishCmd {

    /**
     * uuid
     */
    @Schema(description = "模型唯一标识")
    @NotBlank(message = "编码不能为空")
    private Set<String> uuids;

    /**
     * 发行状态
     */
    @Schema(description = "模型发行状态")
    private ReleaseStatusEnum releaseStatus;

    /**
     * 类型
     */
    @Schema(description = "类型")
    private ServiceModelTypeEnum type;
}
