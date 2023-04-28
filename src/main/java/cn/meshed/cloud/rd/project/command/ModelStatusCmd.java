package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceModelStatusEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "模型状态操作模型")
public class ModelStatusCmd extends Command {

    /**
     * uuid
     */
    @Schema(description = "模型唯一标识")
    @NotBlank(message = "编码不能为空")
    private String uuid;

    /**
     * 模型状态
     */
    @Schema(description = "模型状态")
    private ServiceModelStatusEnum status;

    /**
     * 模型发行状态
     */
    @Schema(description = "模型发行状态")
    private ReleaseStatusEnum releaseStatus;
}
