package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <h1>项目改变数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "项目操作数据")
public class ProjectChangeCmd extends Command {

    /**
     * uuid
     */
    @Schema(description = "项目通用唯一编码")
    @NotBlank(message = "项目通用唯一编码不能为空")
    private String uuid;

    /**
     * type
     */
    @Schema(description = "项目类型")
    @NotNull(message = "项目类型不能为空")
    private ProjectTypeEnum type;


}
